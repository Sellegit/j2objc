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
 * @since Available in iOS 3.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UILocalizedIndexedCollation")
public class UILocalizedIndexedCollation 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UILocalizedIndexedCollation() { }

    
    @Mapping("sectionTitles")
    public native List<String> getSectionTitles();
    @Mapping("sectionIndexTitles")
    public native List<String> getSectionIndexTitles();

    
    
    @Mapping("sectionForSectionIndexTitleAtIndex:")
    public native @MachineSizedSInt long getSection(@MachineSizedSInt long indexTitleIndex);
    @Mapping("sectionForObject:collationStringSelector:")
    public native @MachineSizedSInt long getSection(Object object, Selector selector);
    @Mapping("sortedArrayFromArray:collationStringSelector:")
    public native NSArray<?> sortArray(NSArray<?> array, Selector selector);
    @Mapping("currentCollation")
    public static native UILocalizedIndexedCollation getCurrentCollation();

}
