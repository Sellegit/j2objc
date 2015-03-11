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





@Library("CoreGraphics")
@Mapping("CGTextDrawingMode")
public final class CGTextDrawingMode extends ObjCEnum {
    
    @GlobalConstant("kCGTextFill")
    public static final long Fill = 0L;
    @GlobalConstant("kCGTextStroke")
    public static final long Stroke = 1L;
    @GlobalConstant("kCGTextFillStroke")
    public static final long FillStroke = 2L;
    @GlobalConstant("kCGTextInvisible")
    public static final long Invisible = 3L;
    @GlobalConstant("kCGTextFillClip")
    public static final long FillClip = 4L;
    @GlobalConstant("kCGTextStrokeClip")
    public static final long StrokeClip = 5L;
    @GlobalConstant("kCGTextFillStrokeClip")
    public static final long FillStrokeClip = 6L;
    @GlobalConstant("kCGTextClip")
    public static final long Clip = 7L;
    

}
