package TemplateMethodPattern;

public class GamingComputer extends Computer {

    void plugCpu() {
        System.out.println("Putting High-end multi-core cpu");
    }

    @Override
    void plugMemory() {
        System.out.println("Putting High-clock speed memory");
    }

    @Override
    void plugStorage() {
        System.out.println("Putting SSD storage");
    }
}
