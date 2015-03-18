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

@Library("UIKit/UIKit.h") @Mapping("UIPasteboard")
public class UIPasteboard 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIPasteboard() { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("isPersistent")
    public native boolean isPersistent();
    @Mapping("setPersistent:")
    public native void setPersistent(boolean v);
    @Mapping("changeCount")
    public native @MachineSizedSInt long getChangeCount();
    @Mapping("numberOfItems")
    public native @MachineSizedSInt long getNumberOfItems();
    @Mapping("items")
    public native NSArray<NSDictionary<NSString, NSObject>> getItems0();
    @Mapping("setItems:")
    public native void setItems0(NSArray<NSDictionary<NSString, NSObject>> v);
    @Mapping("string")
    public native String getString();
    @Mapping("setString:")
    public native void setString(String v);
    @Mapping("strings")
    public native List<String> getStrings();
    @Mapping("setStrings:")
    public native void setStrings(List<String> v);
    @Mapping("URL")
    public native NSURL getURL();
    @Mapping("setURL:")
    public native void setURL(NSURL v);
    @Mapping("URLs")
    public native NSArray<NSURL> getURLs();
    @Mapping("setURLs:")
    public native void setURLs(NSArray<NSURL> v);
    @Mapping("image")
    public native UIImage getImage();
    @Mapping("setImage:")
    public native void setImage(UIImage v);
    @Mapping("images")
    public native NSArray<UIImage> getImages();
    @Mapping("setImages:")
    public native void setImages(NSArray<UIImage> v);
    @Mapping("color")
    public native UIColor getColor();
    @Mapping("setColor:")
    public native void setColor(UIColor v);
    @Mapping("colors")
    public native NSArray<UIColor> getColors();
    @Mapping("setColors:")
    public native void setColors(NSArray<UIColor> v);
    
    
    
    @GlobalConstant("UIPasteboardNameFind")
    public static native String PasteboardNameFind();
    @GlobalConstant("UIPasteboardChangedNotification")
    public static native NSString ChangedNotification();
    @GlobalConstant("UIPasteboardRemovedNotification")
    public static native NSString RemovedNotification();
    @GlobalConstant("UIPasteboardTypeListString")
    public static native List<String> getStringTypeList();
    @GlobalConstant("UIPasteboardTypeListURL")
    public static native List<String> getURLTypeList();
    @GlobalConstant("UIPasteboardTypeListImage")
    public static native List<String> getImageTypeList();
    @GlobalConstant("UIPasteboardTypeListColor")
    public static native List<String> getColorTypeList();
    
    @Mapping("pasteboardTypes")
    public native List<String> getTypes();
    @Mapping("containsPasteboardTypes:")
    public native boolean contains(NSArray<?> pasteboardTypes);
    @Mapping("dataForPasteboardType:")
    public native NSData getData(String pasteboardType);
    @Mapping("valueForPasteboardType:")
    public native Object getValue(String pasteboardType);
    @Mapping("setValue:forPasteboardType:")
    public native void setValue(Object value, String pasteboardType);
    @Mapping("setData:forPasteboardType:")
    public native void setData(NSData data, String pasteboardType);
    @Mapping("pasteboardTypesForItemSet:")
    public native NSArray<NSArray<NSString>> getTypes0(NSIndexSet itemSet);
    @Mapping("containsPasteboardTypes:inItemSet:")
    public native boolean contains(NSArray<?> pasteboardTypes, NSIndexSet itemSet);
    @Mapping("itemSetWithPasteboardTypes:")
    public native NSIndexSet getItemsWithTypes(NSArray<?> pasteboardTypes);
    @Mapping("valuesForPasteboardType:inItemSet:")
    public native NSArray<?> getValues(String pasteboardType, NSIndexSet itemSet);
    @Mapping("dataForPasteboardType:inItemSet:")
    public native NSArray<NSData> getData(String pasteboardType, NSIndexSet itemSet);
    @Mapping("addItems:")
    public native void addItems(NSArray<?> items);
    @Mapping("generalPasteboard")
    public static native UIPasteboard getGeneralPasteboard();
    @Mapping("pasteboardWithName:create:")
    public static native UIPasteboard getPasteboard(String pasteboardName, boolean create);
    @Mapping("pasteboardWithUniqueName")
    public static native UIPasteboard getUniquePasteboard();
    @Mapping("removePasteboardWithName:")
    public static native void removePasteboard(String pasteboardName);
    
}
