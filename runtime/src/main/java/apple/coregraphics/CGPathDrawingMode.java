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
@Mapping("CGPathDrawingMode")
public final class CGPathDrawingMode extends ObjCEnum {
    
    @GlobalConstant("kCGPathFill")
    public static final long Fill = 0L;
    @GlobalConstant("kCGPathEOFill")
    public static final long EOFill = 1L;
    @GlobalConstant("kCGPathStroke")
    public static final long Stroke = 2L;
    @GlobalConstant("kCGPathFillStroke")
    public static final long FillStroke = 3L;
    @GlobalConstant("kCGPathEOFillStroke")
    public static final long EOFillStroke = 4L;
    

}
