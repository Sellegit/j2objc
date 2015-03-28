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
 * @since Available in iOS 8.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIAlertController")
public class UIAlertController 
    extends UIViewController 
     {

    
    
    @Mapping("initWithNibName:bundle:")
    public UIAlertController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    @Mapping("initWithCoder:")
    public UIAlertController(NSCoder aDecoder) { }
    @Mapping("init")
    public UIAlertController() { }

    
    @Mapping("actions")
    public native NSArray<UIAlertAction> getActions();
    @Mapping("textFields")
    public native NSArray<UITextField> getTextFields();
    @Mapping("title")
    public native String getTitle();
    @Mapping("setTitle:")
    public native void setTitle(String v);
    @Mapping("message")
    public native String getMessage();
    @Mapping("setMessage:")
    public native void setMessage(String v);
    @Mapping("preferredStyle")
    public native @Representing("UIAlertControllerStyle") long getPreferredStyle();

    
    
    @Mapping("addAction:")
    public native void addAction(UIAlertAction action);
    @Mapping("addTextFieldWithConfigurationHandler:")
    public native void addTextField(@Block VoidBlock1<UITextField> configurationHandler);
    @Mapping("alertControllerWithTitle:message:preferredStyle:")
    public static native UIAlertController create(String title, String message, @Representing("UIAlertControllerStyle") long preferredStyle);

}
