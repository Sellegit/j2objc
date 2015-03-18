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
 * @since Available in iOS 6.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UIActivityItemProvider")
public class UIActivityItemProvider 
    extends NSOperation 
    implements UIActivityItemSource {

    
    
    @Mapping("initWithPlaceholderItem:")
    public UIActivityItemProvider(Object placeholderItem) { }
    @Mapping("init")
    public UIActivityItemProvider() { }
    
    
    @Mapping("placeholderItem")
    public native Object getPlaceholderItem();
    @Mapping("activityType")
    public native String getActivityType();
    
    
    
    @Mapping("item")
    public native Object getItem();
    @Mapping("activityViewControllerPlaceholderItem:")
    public native Object getPlaceholderItem(UIActivityViewController activityViewController);
    @Mapping("activityViewController:itemForActivityType:")
    public native Object getItem(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:subjectForActivityType:")
    public native String getSubject(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:dataTypeIdentifierForActivityType:")
    public native String getDataTypeIdentifier(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    public native UIImage getThumbnailImage(UIActivityViewController activityViewController, String activityType, CGSize size);
    
}
