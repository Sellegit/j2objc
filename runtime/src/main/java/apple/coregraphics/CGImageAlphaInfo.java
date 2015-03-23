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


@Library("CoreGraphics/CoreGraphics.h")
@Mapping("CGImageAlphaInfo")
public final class CGImageAlphaInfo extends ObjCEnum {
    
    @GlobalConstant("kCGImageAlphaNone")
    public static final long None = 0L;
    @GlobalConstant("kCGImageAlphaPremultipliedLast")
    public static final long PremultipliedLast = 1L;
    @GlobalConstant("kCGImageAlphaPremultipliedFirst")
    public static final long PremultipliedFirst = 2L;
    @GlobalConstant("kCGImageAlphaLast")
    public static final long Last = 3L;
    @GlobalConstant("kCGImageAlphaFirst")
    public static final long First = 4L;
    @GlobalConstant("kCGImageAlphaNoneSkipLast")
    public static final long NoneSkipLast = 5L;
    @GlobalConstant("kCGImageAlphaNoneSkipFirst")
    public static final long NoneSkipFirst = 6L;
    @GlobalConstant("kCGImageAlphaOnly")
    public static final long Only = 7L;


}
