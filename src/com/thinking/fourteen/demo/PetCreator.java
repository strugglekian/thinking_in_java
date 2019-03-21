/**
 * @Author kkf7688
 * @Data 2019/2/14
 * @Version 1.0
 */

package com.thinking.fourteen.demo;

import java.util.List;
import java.util.Random;

public abstract class PetCreator {
    Random random = new Random(2);

    abstract List<Class<? extends Pet>> types();

    public Pet randomPet() {
        int n = random.nextInt(2);
        try {
            return types().get(n).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }
}
