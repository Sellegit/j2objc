package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


@Library("Foundation/Foundation.h")
@Mapping("NSMatchingOptions")
public final class NSMatchingOptions extends ObjCEnum {
    
    @GlobalConstant("NSMatchingReportProgress")
    public static final long ReportProgress = 1L;
    @GlobalConstant("NSMatchingReportCompletion")
    public static final long ReportCompletion = 2L;
    @GlobalConstant("NSMatchingAnchored")
    public static final long Anchored = 4L;
    @GlobalConstant("NSMatchingWithTransparentBounds")
    public static final long WithTransparentBounds = 8L;
    @GlobalConstant("NSMatchingWithoutAnchoringBounds")
    public static final long WithoutAnchoringBounds = 16L;


}
