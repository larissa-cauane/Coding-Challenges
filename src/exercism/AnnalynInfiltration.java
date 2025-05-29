package exercism;
public class AnnalynInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return petDogIsPresent && !archerIsAwake || !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;
    }

    public static void main(String[] args) {
        //Check if a fast attack can be made
        boolean knightIsAwake = true;
        System.out.println(canFastAttack(knightIsAwake));

        //Check if the group can be spied upon
        knightIsAwake = false;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = false;
        System.out.println(canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));

        //Check if the prisoner can be signaled
        archerIsAwake = false;
        prisonerIsAwake = true;
        System.out.println(canSignalPrisoner(archerIsAwake, prisonerIsAwake));

        //Check if the prisoner can be freed
        archerIsAwake = true;
        prisonerIsAwake = false;
        boolean petDogIsPresent = false;
        System.out.println(canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));

    }

}
