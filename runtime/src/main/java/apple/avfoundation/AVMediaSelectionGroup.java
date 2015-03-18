package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVMediaSelectionGroup")
public class AVMediaSelectionGroup 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public AVMediaSelectionGroup() { }
    
    
    @Mapping("options")
    public native NSArray<AVMediaSelectionOption> getOptions();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("defaultOption")
    public native AVMediaSelectionOption getDefaultOption();
    @Mapping("allowsEmptySelection")
    public native boolean allowsEmptySelection();
    
    
    
    @Mapping("mediaSelectionOptionWithPropertyList:")
    public native AVMediaSelectionOption getMediaSelectionOption(Object plist);
    @Mapping("playableMediaSelectionOptionsFromArray:")
    public static native NSArray<AVMediaSelectionOption> filterPlayableMediaSelectionOptions(NSArray<?> mediaSelectionOptions);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("mediaSelectionOptionsFromArray:filteredAndSortedAccordingToPreferredLanguages:")
    public static native NSArray<AVMediaSelectionOption> filterMediaSelectionOptionsByPreferredLanguages(NSArray<?> mediaSelectionOptions, NSArray<?> preferredLanguages);
    @Mapping("mediaSelectionOptionsFromArray:withLocale:")
    public static native NSArray<AVMediaSelectionOption> filterMediaSelectionOptionsByLocale(NSArray<?> mediaSelectionOptions, NSLocale locale);
    @Mapping("mediaSelectionOptionsFromArray:withMediaCharacteristics:")
    public static native NSArray<AVMediaSelectionOption> filterMediaSelectionOptionsWithMediaCharacteristics(NSArray<?> mediaSelectionOptions, NSArray<?> mediaCharacteristics);
    @Mapping("mediaSelectionOptionsFromArray:withoutMediaCharacteristics:")
    public static native NSArray<AVMediaSelectionOption> filterMediaSelectionOptionsWithoutMediaCharacteristics(NSArray<?> mediaSelectionOptions, NSArray<?> mediaCharacteristics);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
