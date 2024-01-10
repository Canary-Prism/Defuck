class Main {
    public static void main(String[] args) {
        var memory = new int[60_000];
        var pointer = 30_000;
        memory[pointer] = (memory[pointer] + 13) & 255;
        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 2) & 255;
        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 5) & 255;
        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 2) & 255;
        memory[pointer + 6] = (memory[pointer + 6] + memory[pointer] * 1) & 255;
        memory[pointer] = 0;
        pointer += 5;
        memory[pointer] = (memory[pointer] + 6) & 255;
        pointer += 1;
        memory[pointer] = (memory[pointer] + -3) & 255;
        pointer += 10;
        memory[pointer] = (memory[pointer] + 15) & 255;
        while (memory[pointer] != 0) {
            while (memory[pointer] != 0) {
                pointer += 9;
            }
            memory[pointer] = (memory[pointer] + 1) & 255;
            while (memory[pointer] != 0) {
                pointer += -9;
            }
            pointer += 9;
            memory[pointer] = (memory[pointer] + -1) & 255;
        }
        memory[pointer] = (memory[pointer] + 1) & 255;
        while (memory[pointer] != 0) {
            pointer += 8;
            memory[pointer] = 0;
            pointer += 1;
        }
        pointer += -9;
        while (memory[pointer] != 0) {
            pointer += -9;
        }
        pointer += 8;
        memory[pointer] = 1;
        pointer += -7;
        memory[pointer] = (memory[pointer] + 5) & 255;
        while (memory[pointer] != 0) {
            memory[pointer] = (memory[pointer] + -1) & 255;
            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
            memory[pointer] = 0;
            pointer += 9;
        }
        pointer += 7;
        memory[pointer] = (memory[pointer] + 1) & 255;
        pointer += 27;
        memory[pointer] = (memory[pointer] + 1) & 255;
        pointer += -17;
        while (memory[pointer] != 0) {
            pointer += -9;
        }
        pointer += 3;
        memory[pointer] = 1;
        while (memory[pointer] != 0) {
            pointer += 6;
            while (memory[pointer] != 0) {
                pointer += 7;
                memory[pointer] = 0;
                pointer += 2;
            }
            pointer += -9;
            while (memory[pointer] != 0) {
                pointer += -9;
            }
            pointer += 7;
            memory[pointer] = 1;
            pointer += -6;
            memory[pointer] = (memory[pointer] + 4) & 255;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += 9;
            }
            pointer += 6;
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += -6;
            memory[pointer] = (memory[pointer] + 7) & 255;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += 9;
            }
            pointer += 6;
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += -16;
            while (memory[pointer] != 0) {
                pointer += -9;
            }
            pointer += 3;
            while (memory[pointer] != 0) {
                memory[pointer] = 0;
                pointer += 6;
                while (memory[pointer] != 0) {
                    pointer += 7;
                    memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -6;
                    memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                    memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                    memory[pointer + 6] = (memory[pointer + 6] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 8;
                    memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -7;
                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                    memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                    memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 7;
                memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += -7;
                memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += 9;
                memory[pointer] = (memory[pointer] + 15) & 255;
                while (memory[pointer] != 0) {
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                }
                memory[pointer] = (memory[pointer] + 1) & 255;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -5;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 2;
                            memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -2;
                            memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                            memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                            memory[pointer] = 1;
                            pointer += 9;
                        }
                        pointer += -8;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -10;
                    }
                    pointer += 1;
                    memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                        memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 4;
                    }
                    pointer += -3;
                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 5;
                    memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -5;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -6;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -3;
                            memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                            memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                            memory[pointer] = 1;
                            pointer += 9;
                        }
                        pointer += -8;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -11;
                    }
                    pointer += 2;
                    memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -2;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                        memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 4;
                    }
                    pointer += -3;
                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 4;
                    memory[pointer + -36] = (memory[pointer + -36] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 5;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                memory[pointer] = (memory[pointer] + 15) & 255;
                while (memory[pointer] != 0) {
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    pointer += -9;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                }
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 21;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += -3;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 3;
                    memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -3;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 3;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 1;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -13;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                            pointer += 4;
                            memory[pointer] = 1;
                            pointer += 5;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += 1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                        }
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -1;
                        memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -12;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                            pointer += 3;
                            memory[pointer] = 1;
                            pointer += 6;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += 1;
                            memory[pointer] = 1;
                            pointer += -1;
                        }
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -8;
                    }
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += -7;
                memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * -1) & 255;
                memory[pointer] = 0;
                pointer += 9;
                memory[pointer] = (memory[pointer] + 26) & 255;
                pointer += 2;
                memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += -4;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -2;
                    memory[pointer] = 0;
                    pointer += -2;
                }
                pointer += 2;
                while (memory[pointer] != 0) {
                    pointer += -7;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -2;
                        memory[pointer] = 0;
                    }
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -2;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * -1) & 255;
                        memory[pointer] = 0;
                        pointer += 3;
                    }
                    pointer += 13;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 5;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 3;
                    memory[pointer] = 0;
                    pointer += 6;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        memory[pointer + -9] = (memory[pointer + -9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 7;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -5;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 5;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -6;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 1;
                                pointer += 9;
                            }
                            pointer += -8;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                        }
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -10;
                        }
                        pointer += 1;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -3;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 3;
                        }
                        pointer += -2;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 6;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -5;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -5;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 5;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -6;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                                memory[pointer] = 1;
                                pointer += 9;
                            }
                            pointer += -8;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                        }
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -10;
                        }
                        pointer += 1;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 4;
                        }
                        pointer += -3;
                        memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 4;
                        memory[pointer + -36] = (memory[pointer + -36] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 5;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 3;
                        memory[pointer + -36] = (memory[pointer + -36] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 6;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 8;
                        memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -7;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 6;
                        memory[pointer] = 0;
                        pointer += 3;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                    memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -6;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 2) & 255;
                        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                    }
                    pointer += -1;
                    memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -5;
                    memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 6;
                    memory[pointer] = 0;
                    pointer += -6;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        while (memory[pointer] != 0) {
                            pointer += 2;
                            memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                            memory[pointer] = 1;
                            pointer += -2;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 1;
                                memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -3;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 3;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -12;
                                    while (memory[pointer] != 0) {
                                        pointer += -9;
                                    }
                                    pointer += 3;
                                    memory[pointer] = 1;
                                    pointer += 6;
                                    while (memory[pointer] != 0) {
                                        pointer += 9;
                                    }
                                    pointer += 1;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -1;
                                }
                            }
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 3;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                            memory[pointer] = 1;
                            pointer += -3;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -1;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 2;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -11;
                                    while (memory[pointer] != 0) {
                                        pointer += -9;
                                    }
                                    pointer += 4;
                                    memory[pointer] = 1;
                                    pointer += 5;
                                    while (memory[pointer] != 0) {
                                        pointer += 9;
                                    }
                                    pointer += 1;
                                    memory[pointer] = 1;
                                    pointer += -1;
                                }
                            }
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -1;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += -8;
                            }
                            pointer += 8;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 5;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += 8;
                            }
                            pointer += -8;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 5;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -4;
                                    while (memory[pointer] != 0) {
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += 4;
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += -14;
                                        memory[pointer] = (memory[pointer] + 1) & 255;
                                        pointer += 11;
                                        memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                        memory[pointer] = 0;
                                        pointer += -1;
                                    }
                                    pointer += 1;
                                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                    memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -2;
                                }
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 4;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -3;
                                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                    memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 1;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -12;
                            }
                            pointer += 4;
                            memory[pointer] = 0;
                            pointer += -4;
                        }
                        pointer += 3;
                        memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 6;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 1;
                                memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                                memory[pointer] = 0;
                                pointer += -1;
                                memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += 8;
                            }
                            pointer += -8;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 5;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -3;
                                    while (memory[pointer] != 0) {
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += 3;
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += -14;
                                        memory[pointer] = (memory[pointer] + 1) & 255;
                                        pointer += 10;
                                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                                        memory[pointer] = 0;
                                        pointer += 1;
                                    }
                                    pointer += -1;
                                    memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * -1) & 255;
                                    memory[pointer + -10] = (memory[pointer + -10] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 2;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 3;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -4;
                                    memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * -1) & 255;
                                    memory[pointer + -10] = (memory[pointer + -10] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += 1;
                                }
                                pointer += -1;
                                memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -11;
                            }
                            pointer += 6;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -6;
                        }
                    }
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 5;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 5;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -4;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 4;
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -14;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += 11;
                                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 1;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                            }
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 4;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -3;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -1;
                            }
                            pointer += 1;
                            memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -12;
                        }
                    }
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 2;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 5;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 6;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -5;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 1;
                                pointer += 9;
                            }
                            pointer += -8;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                        }
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -10;
                        }
                        pointer += 1;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -3;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 3;
                        }
                        pointer += -2;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 3;
                        memory[pointer + -36] = (memory[pointer + -36] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 6;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 5;
                    memory[pointer] = 0;
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 3;
                        memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 1;
                            memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -4;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 4;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -13;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 4;
                                memory[pointer] = 1;
                                pointer += 5;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -1;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -3;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -12;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 3;
                                memory[pointer] = 1;
                                pointer += 6;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = 1;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += -8;
                        }
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 3;
                    memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -3;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 3;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 6;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 3;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                            memory[pointer] = 0;
                            pointer += -3;
                            memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 8;
                        }
                        pointer += -8;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -1;
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -10;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += 12;
                                    memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 1;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                                memory[pointer + -12] = (memory[pointer + -12] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -3;
                            }
                            pointer += 2;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                                memory[pointer + -12] = (memory[pointer + -12] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -1;
                            }
                            pointer += 1;
                            memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -13;
                        }
                    }
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 5;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 2;
                            memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                            memory[pointer] = 0;
                            pointer += -2;
                            memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 8;
                        }
                        pointer += -8;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 2;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -2;
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -10;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += 11;
                                    memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += 1;
                                }
                                pointer += -1;
                                memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                            }
                            pointer += 3;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -2;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 1;
                                memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += 1;
                            }
                            pointer += -1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -12;
                        }
                        pointer += 5;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -5;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 3;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 4;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 3;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 5;
                    while (memory[pointer] != 0) {
                        pointer += 7;
                        memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -6;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer + 6] = (memory[pointer + 6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                    memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 2;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -7;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 2) & 255;
                        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 2;
                    }
                    pointer += -2;
                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -5;
                    memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 1;
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        while (memory[pointer] != 0) {
                            pointer += 3;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                            memory[pointer] = 1;
                            pointer += -3;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -1;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 2;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -11;
                                    while (memory[pointer] != 0) {
                                        pointer += -9;
                                    }
                                    pointer += 4;
                                    memory[pointer] = 1;
                                    pointer += 5;
                                    while (memory[pointer] != 0) {
                                        pointer += 9;
                                    }
                                    pointer += 1;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -1;
                                }
                            }
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 2;
                            memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                            memory[pointer] = 1;
                            pointer += -2;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 1;
                                memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -3;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 3;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -12;
                                    while (memory[pointer] != 0) {
                                        pointer += -9;
                                    }
                                    pointer += 3;
                                    memory[pointer] = 1;
                                    pointer += 6;
                                    while (memory[pointer] != 0) {
                                        pointer += 9;
                                    }
                                    pointer += 1;
                                    memory[pointer] = 1;
                                    pointer += -1;
                                }
                            }
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += -1;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += -8;
                            }
                            pointer += 8;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 3;
                        memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 6;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 1;
                                memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                                memory[pointer] = 0;
                                pointer += -1;
                                memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += 8;
                            }
                            pointer += -8;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 4;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -2;
                                    while (memory[pointer] != 0) {
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += 2;
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += -13;
                                        memory[pointer] = (memory[pointer] + 1) & 255;
                                        pointer += 10;
                                        memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                        memory[pointer] = 0;
                                        pointer += 1;
                                    }
                                    pointer += -1;
                                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                    memory[pointer + -10] = (memory[pointer + -10] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 2;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 2;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -3;
                                    memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * -1) & 255;
                                    memory[pointer + -10] = (memory[pointer + -10] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += 1;
                                }
                                pointer += -1;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -11;
                            }
                            pointer += 5;
                            memory[pointer] = 0;
                            pointer += 2;
                            memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -7;
                            memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                            memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                        }
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 5;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * -1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += 8;
                            }
                            pointer += -8;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 4;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -3;
                                    while (memory[pointer] != 0) {
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += 3;
                                        memory[pointer] = (memory[pointer] + -1) & 255;
                                        pointer += -13;
                                        memory[pointer] = (memory[pointer] + 1) & 255;
                                        pointer += 11;
                                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                        memory[pointer] = 0;
                                        pointer += -1;
                                    }
                                    pointer += 1;
                                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * -1) & 255;
                                    memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -2;
                                }
                                pointer += 1;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 3;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += -2;
                                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * -1) & 255;
                                    memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 1;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -12;
                            }
                        }
                        pointer += 4;
                        memory[pointer] = 0;
                        pointer += -4;
                    }
                    pointer += 4;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 2;
                        memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -7;
                        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                        memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 4;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -3;
                                while (memory[pointer] != 0) {
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += 3;
                                    memory[pointer] = (memory[pointer] + -1) & 255;
                                    pointer += -13;
                                    memory[pointer] = (memory[pointer] + 1) & 255;
                                    pointer += 11;
                                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                    memory[pointer] = 0;
                                    pointer += -1;
                                }
                                pointer += 1;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                            }
                            pointer += 1;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * -1) & 255;
                                memory[pointer + -11] = (memory[pointer + -11] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -1;
                            }
                            pointer += 1;
                            memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -12;
                        }
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 2;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 6;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 3;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 5;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 6;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -5;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -5;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 2;
                                memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -2;
                                memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                                memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                                memory[pointer] = 1;
                                pointer += 9;
                            }
                            pointer += -8;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                        }
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 1;
                            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -10;
                        }
                        pointer += 1;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 4;
                        }
                        pointer += -3;
                        memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -5;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 5;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -6;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                                memory[pointer] = 0;
                                pointer += -3;
                                memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                                memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                                memory[pointer] = 1;
                                pointer += 9;
                            }
                            pointer += -8;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                        }
                        pointer += 9;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += 2;
                            memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -11;
                        }
                        pointer += 2;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -2;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -4;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 4;
                        }
                        pointer += -3;
                        memory[pointer + 3] = (memory[pointer + 3] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 4;
                        memory[pointer + -36] = (memory[pointer + -36] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 5;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    memory[pointer] = (memory[pointer] + 15) & 255;
                    while (memory[pointer] != 0) {
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -9;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 9;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 21;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -3;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 3;
                        memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -3;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 3;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 1;
                            memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -4;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 4;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -13;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 4;
                                memory[pointer] = 1;
                                pointer += 5;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -4;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 4;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -1;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -3;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 3;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -12;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 3;
                                memory[pointer] = 1;
                                pointer += 6;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = 1;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += -8;
                        }
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 2;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 2;
                    memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -4;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 4;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -2;
                        memory[pointer] = 0;
                        pointer += -2;
                    }
                    pointer += 2;
                }
                pointer += -2;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 4;
                memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                memory[pointer] = 1;
                pointer += -4;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += -6;
                    System.out.write((char)memory[pointer]);
                    pointer += 2;
                }
                pointer += 4;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += -7;
                    System.out.write((char)memory[pointer]);
                    pointer += 7;
                }
                pointer += -3;
                memory[pointer] = 0;
                pointer += 1;
                memory[pointer] = 0;
                pointer += 1;
                memory[pointer] = 0;
                pointer += 1;
                memory[pointer] = 0;
                pointer += 1;
                memory[pointer] = 0;
                pointer += 1;
                memory[pointer] = 0;
                pointer += 3;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += 3;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 5;
                    memory[pointer] = 0;
                    pointer += 4;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 1;
                memory[pointer] = (memory[pointer] + 11) & 255;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 9;
                }
                pointer += 4;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 9;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += -14;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 7;
                memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += -7;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 7;
                    memory[pointer] = 0;
                    pointer += 2;
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 7;
                        memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -6;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 6;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -7;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                            pointer += 7;
                            memory[pointer] = 1;
                            pointer += 3;
                        }
                        pointer += -10;
                    }
                }
                pointer += 7;
                memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += -7;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 7;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 2;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 4;
                        memory[pointer + -4] = (memory[pointer + -4] + memory[pointer] * -1) & 255;
                        memory[pointer] = 0;
                        pointer += -4;
                        memory[pointer + 4] = (memory[pointer + 4] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -2;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -7;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -14;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 9;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 7;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -7;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 7;
                        }
                        pointer += -6;
                        memory[pointer + 6] = (memory[pointer + 6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 7;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += -4;
                    memory[pointer] = 1;
                    pointer += -3;
                }
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 7;
                memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * -1) & 255;
                memory[pointer] = 1;
                pointer += -7;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 7;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 2;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 4;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += 1;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 7;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -7;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += 1;
                            memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                            memory[pointer + -3] = (memory[pointer + -3] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -1;
                            memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += 7;
                        }
                        pointer += -6;
                        memory[pointer + 6] = (memory[pointer + 6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -9;
                    }
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + 5) & 255;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 9;
                    }
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -5;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 9;
                    while (memory[pointer] != 0) {
                        pointer += 5;
                        memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -5;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 5;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 2;
                            memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -7;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 7;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -16;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 4;
                                memory[pointer] = 1;
                                pointer += 5;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 7;
                        memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * -1) & 255;
                        memory[pointer] = 1;
                        pointer += -7;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 7;
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -2;
                            memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * 1) & 255;
                            memory[pointer] = 0;
                            pointer += -5;
                            while (memory[pointer] != 0) {
                                memory[pointer] = (memory[pointer] + -1) & 255;
                                pointer += 5;
                                memory[pointer] = (memory[pointer] + 1) & 255;
                                pointer += -14;
                                while (memory[pointer] != 0) {
                                    pointer += -9;
                                }
                                pointer += 3;
                                memory[pointer] = 1;
                                pointer += 6;
                                while (memory[pointer] != 0) {
                                    pointer += 9;
                                }
                                pointer += 1;
                                memory[pointer] = 1;
                                pointer += -1;
                            }
                        }
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += -1;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += -8;
                        }
                        pointer += 8;
                    }
                    pointer += -9;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                    pointer += 4;
                    memory[pointer] = 0;
                    pointer += -3;
                    memory[pointer] = (memory[pointer] + 5) & 255;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 9;
                    }
                    pointer += 4;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += -5;
                    while (memory[pointer] != 0) {
                        pointer += -9;
                    }
                }
                pointer += 3;
            }
            pointer += -4;
            System.out.write((char)memory[pointer]);
            pointer += 10;
            while (memory[pointer] != 0) {
                pointer += 6;
                memory[pointer] = 0;
                pointer += 3;
            }
            pointer += -9;
            while (memory[pointer] != 0) {
                pointer += -9;
            }
            pointer += 1;
            memory[pointer] = (memory[pointer] + 10) & 255;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                memory[pointer] = 0;
                pointer += 9;
            }
            pointer += 5;
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += 9;
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += -15;
            while (memory[pointer] != 0) {
                pointer += -9;
            }
            pointer += 8;
            memory[pointer + -8] = (memory[pointer + -8] + memory[pointer] * 1) & 255;
            memory[pointer] = 0;
            pointer += -8;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += 8;
                memory[pointer] = 0;
                pointer += 1;
                while (memory[pointer] != 0) {
                    pointer += 9;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += 8;
                    memory[pointer + -7] = (memory[pointer + -7] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -7;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 7;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += -8;
                        while (memory[pointer] != 0) {
                            pointer += -9;
                        }
                        pointer += 8;
                        memory[pointer] = 1;
                        pointer += 2;
                    }
                    pointer += -10;
                }
            }
            pointer += 8;
            memory[pointer + -8] = (memory[pointer + -8] + memory[pointer] * 1) & 255;
            memory[pointer] = 0;
            pointer += -8;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += 8;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 1;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 5;
                    memory[pointer + -5] = (memory[pointer + -5] + memory[pointer] * -1) & 255;
                    memory[pointer] = 0;
                    pointer += -5;
                    memory[pointer + 5] = (memory[pointer + 5] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 8;
                }
                pointer += -1;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += -8;
                while (memory[pointer] != 0) {
                    pointer += 6;
                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -15;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 9;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 8;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -8;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                        memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -7;
                    memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -9;
                }
                pointer += 8;
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += -5;
                memory[pointer] = 1;
                pointer += -3;
            }
            memory[pointer] = (memory[pointer] + 1) & 255;
            pointer += 8;
            memory[pointer + -8] = (memory[pointer + -8] + memory[pointer] * -1) & 255;
            memory[pointer] = 1;
            pointer += -8;
            while (memory[pointer] != 0) {
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += 8;
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += 1;
                while (memory[pointer] != 0) {
                    pointer += 6;
                    memory[pointer + 2] = (memory[pointer + 2] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 3;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += 1;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    pointer += 8;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -8;
                        memory[pointer] = (memory[pointer] + 1) & 255;
                        pointer += 1;
                        memory[pointer + -1] = (memory[pointer + -1] + memory[pointer] * -1) & 255;
                        memory[pointer + -2] = (memory[pointer + -2] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -1;
                        memory[pointer + 1] = (memory[pointer + 1] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += 8;
                    }
                    pointer += -7;
                    memory[pointer + 7] = (memory[pointer + 7] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += -1;
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += -9;
                }
                pointer += 1;
                memory[pointer] = (memory[pointer] + 5) & 255;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 9;
                }
                pointer += 5;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += 27;
                memory[pointer] = (memory[pointer] + 1) & 255;
                pointer += -6;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 9;
                while (memory[pointer] != 0) {
                    pointer += 6;
                    memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -6;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 6;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 2;
                        memory[pointer + -8] = (memory[pointer + -8] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -8;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 8;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -17;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                            pointer += 4;
                            memory[pointer] = 1;
                            pointer += 5;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += 1;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -1;
                        }
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 8;
                    memory[pointer + -8] = (memory[pointer + -8] + memory[pointer] * -1) & 255;
                    memory[pointer] = 1;
                    pointer += -8;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += 8;
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -2;
                        memory[pointer + -6] = (memory[pointer + -6] + memory[pointer] * 1) & 255;
                        memory[pointer] = 0;
                        pointer += -6;
                        while (memory[pointer] != 0) {
                            memory[pointer] = (memory[pointer] + -1) & 255;
                            pointer += 6;
                            memory[pointer] = (memory[pointer] + 1) & 255;
                            pointer += -15;
                            while (memory[pointer] != 0) {
                                pointer += -9;
                            }
                            pointer += 3;
                            memory[pointer] = 1;
                            pointer += 6;
                            while (memory[pointer] != 0) {
                                pointer += 9;
                            }
                            pointer += 1;
                            memory[pointer] = 1;
                            pointer += -1;
                        }
                    }
                    memory[pointer] = (memory[pointer] + 1) & 255;
                    pointer += 1;
                    while (memory[pointer] != 0) {
                        memory[pointer] = (memory[pointer] + -1) & 255;
                        pointer += -1;
                        while (memory[pointer] != 0) {
                            pointer += 9;
                        }
                        pointer += -8;
                    }
                    pointer += 8;
                }
                pointer += -9;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
                pointer += 4;
                memory[pointer] = 0;
                pointer += -3;
                memory[pointer] = (memory[pointer] + 5) & 255;
                while (memory[pointer] != 0) {
                    memory[pointer] = (memory[pointer] + -1) & 255;
                    memory[pointer + 9] = (memory[pointer + 9] + memory[pointer] * 1) & 255;
                    memory[pointer] = 0;
                    pointer += 9;
                }
                pointer += 5;
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += 27;
                memory[pointer] = (memory[pointer] + -1) & 255;
                pointer += -6;
                while (memory[pointer] != 0) {
                    pointer += -9;
                }
            }
            pointer += 3;
        }
        return;
    }
}
