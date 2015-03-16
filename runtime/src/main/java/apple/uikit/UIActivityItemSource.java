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





@Library("UIKit/UIKit.h") @Mapping("UIActivityItemSource")
public interface UIActivityItemSource 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("activityViewControllerPlaceholderItem:")
    Object getPlaceholderItem(UIActivityViewController activityViewController);
    @Mapping("activityViewController:itemForActivityType:")
    Object getItem(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:subjectForActivityType:")
    String getSubject(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:dataTypeIdentifierForActivityType:")
    String getDataTypeIdentifier(UIActivityViewController activityViewController, String activityType);
    @Mapping("activityViewController:thumbnailImageForActivityType:suggestedSize:")
    UIImage getThumbnailImage(UIActivityViewController activityViewController, String activityType, CGSize size);
    
    /*<adapter>*/
    /*</adapter>*/
}
