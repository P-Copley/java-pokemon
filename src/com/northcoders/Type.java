package com.northcoders;

public enum Type {
    Normal {
        @Override Type[] getStrengths() {
            return new Type[] {};
        }
    },
    Fire {
        @Override Type[] getStrengths() {
            return new Type[] {Type.Grass};
        }
    },
    Water {
        @Override Type[] getStrengths() {
            return new Type[] {Type.Fire};
        }
    },
    Grass {
        @Override Type[] getStrengths() {
            return new Type[] {Type.Water};
        }
    },
    Electric {
        @Override Type[] getStrengths() {
            return new Type[] {Type.Water};
        }
    },
    Poison {
        @Override Type[] getStrengths() {
            return new Type[] {Type.Grass};
        }
    };


    abstract Type[] getStrengths();


    public float getModifier(Type[] defendingTypes) {
        float total = 0;
        for (Type defenseType : defendingTypes) {
            Type [] defendingStrengths = defenseType.getStrengths();
            for (Type defendingStrength : defendingStrengths) {
                if (defendingStrength == this) {
                    total--;
                    break;
                }

            }
        }

        for (Type attaackingStrength : getStrengths()) {
            for (Type defendingType : defendingTypes) {
                if (attaackingStrength == defendingType) {
                    total++;
                    break;
                }
            }
        }
        return total > 0 ? 1.5f : total < 0 ? 0.5f : 1f;
    };

}

//package com.northcoders;
//
//public enum Type {
//    Fire( "fire", new String[] {"grass"}, new String[] {"water"}),
//    Water( "water", new String[] {"fire"}, new String[] {"grass"}),
//    Grass( "grass", new String[] {"water"}, new String[] {"fire"}),
//    Electric( "electric", new String[] {"water"}, new String[] {}),
//    Poison("poison", new String[]{"water"}, new String[]{"electric"});
//
//    private String type;
//    private String[] weaknesses;
//    private String[] strengths;
//
//
//    Type(String type, String[] strengths, String[] weaknesses) {
//        this.type = type;
//        this.strengths = strengths;
//        this.weaknesses = weaknesses;
//    }
//
//    public String getType() {
//        return type;
//    }
//
//    public String[] getStrengths() {
//        return strengths;
//    }
//
//    public String[] getWeaknesses() {
//        return weaknesses;
//    }
//
//    public double getModifier(Type[] defenderTypes) {
//        int total = 0;
//        for (Type defenderType: defenderTypes) {
//            for (String strength : strengths) {
//                if (strength.equals(defenderType.getType())) {
//                    total++;
//                    break;
//                }
//            }
//            for (String weakness : weaknesses) {
//                if (weakness.equals(defenderType.getType())) {
//                    total--;
//                    break;
//                }
//            }
//        }
//
//        if (total >= 1) return 1.5;
//        if (total <= -1) return 0.5;
//        return 1.0;
//    }
//}

