package io.github.purab;

public class CustomProperty {
    private String name;
    private boolean immutable;

    public CustomProperty(String name, boolean immutable) {
        this.name = name;
        this.immutable = immutable;
    }

    @Override
    public String toString() {
        return "CustomProperty{" +
                "name='" + name + '\'' +
                ", immutable=" + immutable +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isImmutable() {
        return immutable;
    }

    public void setImmutable(boolean immutable) {
        this.immutable = immutable;
    }
}
