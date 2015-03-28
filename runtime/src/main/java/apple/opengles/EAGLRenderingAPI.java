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


@Library("OpenGLES/EAGL.h")
@Mapping("EAGLRenderingAPI")
public final class EAGLRenderingAPI extends ObjCEnum {
    
    @GlobalConstant("kEAGLRenderingAPIOpenGLES1")
    public static final long OpenGLES1 = 1L;
    @GlobalConstant("kEAGLRenderingAPIOpenGLES2")
    public static final long OpenGLES2 = 2L;
    @GlobalConstant("kEAGLRenderingAPIOpenGLES3")
    public static final long OpenGLES3 = 3L;


}
