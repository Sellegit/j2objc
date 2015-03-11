package apple.coretext;


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






@Mapping("CTLineBreakMode")
public final class CTLineBreakMode extends ObjCEnum {
    
    @GlobalConstant("kCTLineBreakByWordWrapping")
    public static final long WordWrapping = 0L;
    @GlobalConstant("kCTLineBreakByCharWrapping")
    public static final long CharWrapping = 1L;
    @GlobalConstant("kCTLineBreakByClipping")
    public static final long Clipping = 2L;
    @GlobalConstant("kCTLineBreakByTruncatingHead")
    public static final long TruncatingHead = 3L;
    @GlobalConstant("kCTLineBreakByTruncatingTail")
    public static final long TruncatingTail = 4L;
    @GlobalConstant("kCTLineBreakByTruncatingMiddle")
    public static final long TruncatingMiddle = 5L;
    

}
