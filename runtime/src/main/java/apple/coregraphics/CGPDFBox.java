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
@Mapping("CGPDFBox")
public final class CGPDFBox extends ObjCEnum {
    
    @GlobalConstant("kCGPDFMediaBox")
    public static final long MediaBox = 0L;
    @GlobalConstant("kCGPDFCropBox")
    public static final long CropBox = 1L;
    @GlobalConstant("kCGPDFBleedBox")
    public static final long BleedBox = 2L;
    @GlobalConstant("kCGPDFTrimBox")
    public static final long TrimBox = 3L;
    @GlobalConstant("kCGPDFArtBox")
    public static final long ArtBox = 4L;
    

}
