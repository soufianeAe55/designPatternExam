package DesginPattern;

import anncieneImplentations.anncienImpl;

public class Adapter extends anncienImpl implements IStrategy{
    @Override
    public void appliquer() {
        GenrateCode();
    }
}
