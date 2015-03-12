package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;





@Mapping("GLKMatrix2")
public class GLKMatrix2 
    extends Struct 
     {

    
    protected GLKMatrix2() {}
    
    
    @DotMapping("m2")
    public native FloatBuffer getM2();
    @DotMapping("m")
    public native FloatBuffer getM();
    
    public static native GLKMatrix2 create(FloatBuffer m2, FloatBuffer m) /*-[
        GLKMatrix2 __new = { .m2 = m2, .m = m };
        return __new;
    ]-*/;
    public static native GLKMatrix2 copyWithm2(GLKMatrix2 original, FloatBuffer m2) /*-[
        original.m2 = m2;
        return original;
    ]-*/;

    
    public static native GLKMatrix2 copyWithm(GLKMatrix2 original, FloatBuffer m) /*-[
        original.m = m;
        return original;
    ]-*/;

    
}
