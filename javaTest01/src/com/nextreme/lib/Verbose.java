package com.nextreme.lib;

/**
 * Created by huazhang on 10/26/15.
 */
public interface Verbose {
    int SILENT = 0;
    int TERSE = 1;
    int NORMAL = 2; // default as final
    int VERBOSE = 3;

    void setVerbosity(int level);
    int getVerbosity();
}
