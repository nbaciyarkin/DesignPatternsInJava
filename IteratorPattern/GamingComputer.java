package IteratorPattern;

public class GamingComputer extends DesktopComputer {
    @Override
    void plugCPU() {
        System.out.println("Putting high-end multi-core cpu.");
    }

    @Override
    void plugMemory() {
        System.out.println("Putting high clock speed memory.");
    }

    @Override
    void plugStorage() {
        System.out.println("Putting ssd storage.");
    }
}
