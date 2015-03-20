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


/*<javadoc>*/
/*</javadoc>*/
@Mapping("CTFontDescriptorRef") @Library("CoreText/CoreText.h")
public class CTFontDescriptor 
    extends CFType 
     {

    
    
    protected CTFontDescriptor() {}
    
    
    
    
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateWithNameAndSize")
    public static native CTFontDescriptor create(CFString name, @MachineSizedFloat double size);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateWithAttributes")
    public static native CTFontDescriptor create(CFDictionary attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithAttributes")
    public static native CTFontDescriptor createCopy(CTFontDescriptor original, CFDictionary attributes);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithFamily")
    public static native CTFontDescriptor createCopy(CTFontDescriptor original, CFString family);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithSymbolicTraits")
    public static native CTFontDescriptor createCopy(CTFontDescriptor original, @Representing("CTFontSymbolicTraits") long symTraitValue, @Representing("CTFontSymbolicTraits") long symTraitMask);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithVariation")
    public static native CTFontDescriptor createCopy(CTFontDescriptor original, CFNumber variationIdentifier, @MachineSizedFloat double variationValue);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithFeature")
    public static native CTFontDescriptor createCopy(CTFontDescriptor original, CFNumber featureTypeIdentifier, CFNumber featureSelectorIdentifier);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateMatchingFontDescriptors")
    public static native CFArray getMatchingFontDescriptors(CTFontDescriptor descriptor, CFSet mandatoryAttributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateMatchingFontDescriptor")
    public static native CTFontDescriptor getMatchingFontDescriptor(CTFontDescriptor descriptor, CFSet mandatoryAttributes);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontDescriptorMatchFontDescriptorsWithProgressHandler")
    public static native boolean matchFontDescriptors(CFArray descriptors, CFSet mandatoryAttributes, FunctionPtr progressBlock);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyAttributes")
    public static native CFDictionary getAttributes(CTFontDescriptor descriptor);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyAttribute")
    public static native CFType getAttribute(CTFontDescriptor descriptor, CFString attribute);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyLocalizedAttribute")
    public static native CFType getLocalizedAttribute(CTFontDescriptor descriptor, CFString attribute, Todo language);
    
}
