class Main {
    public static void main(String[] args) throws Throwable {
        var memory = new int[60_000];
        var pointer = 30_000;
        pointer += 1;
        memory[pointer] = System.in.read() & 255;
        while (memory[pointer] != 0) {
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -10) & 255;
                while (memory[pointer] != 0) {
                    pointer += 3;
                    while (memory[pointer] != 0) {
                        pointer += 4;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        memory[pointer] = 1;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 2) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            while (memory[pointer] != 0) {
                                pointer += 4;
                            }
                            memory[pointer] = (memory[pointer] + 2) & 255;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -5;
                            }
                        }
                        pointer += -3;
                    }
                    memory[pointer] = (memory[pointer] + 6) & 255;
                    memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * -6) & 255;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + -2) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        while (memory[pointer] != 0) {
                            pointer += -4;
                        }
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = System.in.read() & 255;
                    pointer += -1;
                }
                pointer += 1;
            }
            pointer += 3;
            memory[pointer] = (memory[pointer] + 2) & 255;
            pointer += 1;
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += 2;
            while (memory[pointer] != 0) {
                pointer += -2;
                while (memory[pointer] != 0) {
                    pointer += 4;
                    memory[pointer] = 9;
                    pointer += -1;
                    memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * -1) & 255;
                    memory[pointer] = 9;
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        while (memory[pointer] != 0) {
                            pointer += -4;
                        }
                    }
                    pointer += -1;
                    memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 1;
                }
                pointer += 1;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        pointer += 4;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        memory[pointer] = 0;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 4;
                            }
                            pointer += 1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                        }
                        pointer += 1;
                        while (memory[pointer] != 0) {
                            pointer += -1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                pointer += -4;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -4;
                    }
                    pointer += 3;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += -4;
                    }
                }
                pointer += 1;
                while (memory[pointer] != 0) {
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 2;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 1;
                    }
                    pointer += -4;
                    memory[pointer] = 0;
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -4;
                    }
                }
                pointer += 7;
            }
            pointer += 2;
            memory[pointer] = (memory[pointer] + 1) & 255;
            while (memory[pointer] != 0) {
                memory[pointer] = 6;
                pointer += 4;
            }
            pointer += -4;
            while (memory[pointer] != 0) {
                memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * 8) & 255;
                memory[pointer] = 0;
                pointer += -1;
                System.out.write((char)memory[pointer]);
                memory[pointer] = 0;
                pointer += -1;
                memory[pointer] = 0;
                pointer += -1;
                memory[pointer] = 0;
                pointer += -1;
            }
            pointer += -1;
            memory[pointer] = System.in.read() & 255;
        }
        return;
    }
}
