package apple.opengles;


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


@Library("OpenGLES/EAGL.h") @Mapping("EAGLDrawable")
public interface EAGLDrawable 
     {

    
    
    @Mapping("drawableProperties")
    EAGLDrawableProperties getDrawableProperties();
    @Mapping("setDrawableProperties:")
    void setDrawableProperties(EAGLDrawableProperties v);

    


    /*<adapter>*/
    /*</adapter>*/
}
