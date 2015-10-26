package com.nextreme.lib;
import java.util.*;

/**
 * Created by huazhang on 10/26/15.
 */
public class Polygon {
    private List<vector> vertices = new ArrayList<vector>();

    public void add(vector v) {
        vertices.add(v);
    }

    public void remove(vector v) {
        vertices.remove(v);
    }

    public int numVertices() {
        return vertices.size();
    }
}
