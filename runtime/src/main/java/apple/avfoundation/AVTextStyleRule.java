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
 * @since Available in iOS 6.0 and later.
 */

@Library("AVFoundation/AVFoundation.h") @Mapping("AVTextStyleRule")
public class AVTextStyleRule 
    extends NSObject 
    implements NSCopying {

    
    
    public AVTextStyleRule() {}
    @Mapping("initWithTextMarkupAttributes:")
    public AVTextStyleRule(NSDictionary<?, ?> textMarkupAttributes) { }
    @Mapping("initWithTextMarkupAttributes:textSelector:")
    public AVTextStyleRule(NSDictionary<?, ?> textMarkupAttributes, String textSelector) { }
    
    
    @Mapping("textMarkupAttributes")
    public native NSDictionary<NSString, ?> getTextMarkupAttributes();
    @Mapping("textSelector")
    public native String getTextSelector();
    
    
    
    @Mapping("propertyListForTextStyleRules:")
    public static native Object createPropertyList(NSArray<?> textStyleRules);
    @Mapping("textStyleRulesFromPropertyList:")
    public static native NSArray<AVTextStyleRule> createTextStyleRulesArray(Object plist);
    @Mapping("textStyleRuleWithTextMarkupAttributes:")
    public static native AVTextStyleRule create(NSDictionary<?, ?> textMarkupAttributes);
    @Mapping("textStyleRuleWithTextMarkupAttributes:textSelector:")
    public static native AVTextStyleRule create(NSDictionary<?, ?> textMarkupAttributes, String textSelector);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
