package apple.coregraphics;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;





@Mapping("CGFunctionCallbacks")
 class CGFunctionCallbacks 
    extends Struct 
     {

    
    protected CGFunctionCallbacks() {}
    
    
    @DotMapping("version")
    public native int getVersion();
    
    public static native CGFunctionCallbacks copyWithversion(CGFunctionCallbacks original, int version) /*-[
        original.version = version;
        return original;
    ]-*/;

    
    
    
}
