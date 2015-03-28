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


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("UIKit/UIKit.h")
@Mapping("UIFontDescriptorSymbolicTraits")
public final class UIFontDescriptorSymbolicTraits extends ObjCEnum {
    
    @GlobalConstant("UIFontDescriptorTraitItalic")
    public static final long TraitItalic = 1L;
    @GlobalConstant("UIFontDescriptorTraitBold")
    public static final long TraitBold = 2L;
    @GlobalConstant("UIFontDescriptorTraitExpanded")
    public static final long TraitExpanded = 32L;
    @GlobalConstant("UIFontDescriptorTraitCondensed")
    public static final long TraitCondensed = 64L;
    @GlobalConstant("UIFontDescriptorTraitMonoSpace")
    public static final long TraitMonoSpace = 1024L;
    @GlobalConstant("UIFontDescriptorTraitVertical")
    public static final long TraitVertical = 2048L;
    @GlobalConstant("UIFontDescriptorTraitUIOptimized")
    public static final long TraitUIOptimized = 4096L;
    @GlobalConstant("UIFontDescriptorTraitTightLeading")
    public static final long TraitTightLeading = 32768L;
    @GlobalConstant("UIFontDescriptorTraitLooseLeading")
    public static final long TraitLooseLeading = 65536L;
    @GlobalConstant("UIFontDescriptorClassMask")
    public static final long ClassMask = -268435456L;
    @GlobalConstant("UIFontDescriptorClassUnknown")
    public static final long ClassUnknown = 0L;
    @GlobalConstant("UIFontDescriptorClassOldStyleSerifs")
    public static final long ClassOldStyleSerifs = 268435456L;
    @GlobalConstant("UIFontDescriptorClassTransitionalSerifs")
    public static final long ClassTransitionalSerifs = 536870912L;
    @GlobalConstant("UIFontDescriptorClassModernSerifs")
    public static final long ClassModernSerifs = 805306368L;
    @GlobalConstant("UIFontDescriptorClassClarendonSerifs")
    public static final long ClassClarendonSerifs = 1073741824L;
    @GlobalConstant("UIFontDescriptorClassSlabSerifs")
    public static final long ClassSlabSerifs = 1342177280L;
    @GlobalConstant("UIFontDescriptorClassFreeformSerifs")
    public static final long ClassFreeformSerifs = 1879048192L;
    @GlobalConstant("UIFontDescriptorClassSansSerif")
    public static final long ClassSansSerif = -2147483648L;
    @GlobalConstant("UIFontDescriptorClassOrnamentals")
    public static final long ClassOrnamentals = -1879048192L;
    @GlobalConstant("UIFontDescriptorClassScripts")
    public static final long ClassScripts = -1610612736L;
    @GlobalConstant("UIFontDescriptorClassSymbolic")
    public static final long ClassSymbolic = -1073741824L;


}
