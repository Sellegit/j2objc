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
@Library("CoreText")
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
    public static native CTFontDescriptor create(String name, @MachineSizedFloat double size);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateWithAttributes")
    public static native CTFontDescriptor create(CFDictionary attributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithAttributes")
    public native CTFontDescriptor createCopy(CFDictionary attributes);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithFamily")
    public native CTFontDescriptor createCopy(String family);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithSymbolicTraits")
    public native CTFontDescriptor createCopy(CTFontSymbolicTraits symTraitValue, CTFontSymbolicTraits symTraitMask);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithVariation")
    public native CTFontDescriptor createCopy(CFNumber variationIdentifier, @MachineSizedFloat double variationValue);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateCopyWithFeature")
    protected native CTFontDescriptor createCopy(CFNumber featureTypeIdentifier, CFNumber featureSelectorIdentifier);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateMatchingFontDescriptors")
    protected native CFArray getMatchingFontDescriptors(CFSet mandatoryAttributes);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCreateMatchingFontDescriptor")
    protected native CTFontDescriptor getMatchingFontDescriptor(CFSet mandatoryAttributes);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalFunction("CTFontDescriptorMatchFontDescriptorsWithProgressHandler")
    protected static native boolean matchFontDescriptors(CFArray descriptors, CFSet mandatoryAttributes, FunctionPtr progressBlock);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyAttributes")
    public native CFDictionary getAttributes();
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyAttribute")
    public native CFType getAttribute(CTFontAttribute attribute);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @GlobalFunction("CTFontDescriptorCopyLocalizedAttribute")
    protected native CFType getLocalizedAttribute(CTFontAttribute attribute, Todo language);
    
}
