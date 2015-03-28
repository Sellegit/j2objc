package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


@Library("UIKit/UIKit.h")
@Mapping("NSLayoutFormatOptions")
public final class NSLayoutFormatOptions extends ObjCEnum {
    
    @GlobalConstant("NSLayoutFormatAlignAllLeft")
    public static final long AlignAllLeft = 2L;
    @GlobalConstant("NSLayoutFormatAlignAllRight")
    public static final long AlignAllRight = 4L;
    @GlobalConstant("NSLayoutFormatAlignAllTop")
    public static final long AlignAllTop = 8L;
    @GlobalConstant("NSLayoutFormatAlignAllBottom")
    public static final long AlignAllBottom = 16L;
    @GlobalConstant("NSLayoutFormatAlignAllLeading")
    public static final long AlignAllLeading = 32L;
    @GlobalConstant("NSLayoutFormatAlignAllTrailing")
    public static final long AlignAllTrailing = 64L;
    @GlobalConstant("NSLayoutFormatAlignAllCenterX")
    public static final long AlignAllCenterX = 512L;
    @GlobalConstant("NSLayoutFormatAlignAllCenterY")
    public static final long AlignAllCenterY = 1024L;
    @GlobalConstant("NSLayoutFormatAlignAllBaseline")
    public static final long AlignAllBaseline = 2048L;
    @GlobalConstant("NSLayoutFormatAlignAllLastBaseline")
    public static final long AlignAllLastBaseline = 2048L;
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSLayoutFormatAlignAllFirstBaseline")
    public static final long AlignAllFirstBaseline = 4096L;
    @GlobalConstant("NSLayoutFormatAlignmentMask")
    public static final long AlignmentMask = 65535L;
    @GlobalConstant("NSLayoutFormatDirectionLeadingToTrailing")
    public static final long DirectionLeadingToTrailing = 0L;
    @GlobalConstant("NSLayoutFormatDirectionLeftToRight")
    public static final long DirectionLeftToRight = 65536L;
    @GlobalConstant("NSLayoutFormatDirectionRightToLeft")
    public static final long DirectionRightToLeft = 131072L;
    @GlobalConstant("NSLayoutFormatDirectionMask")
    public static final long DirectionMask = 196608L;


}
