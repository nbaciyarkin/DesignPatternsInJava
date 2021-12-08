package TemplateMethodPattern;

public class OfficeComputer extends Computer {
    @Override
    void plugCpu() {
        System.out.println("Putting Low-end dual-core cpu");
    }

    @Override
    void plugMemory() {
        System.out.println("Putting Energy-efficient memory");
    }

    @Override
    void plugStorage() {
        System.out.println("Putting Energy-efficient HDD");
    }
}
