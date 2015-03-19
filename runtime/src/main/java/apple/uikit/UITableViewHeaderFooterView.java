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

@Library("UIKit/UIKit.h") @Mapping("UITableViewHeaderFooterView")
public class UITableViewHeaderFooterView 
    extends UIView 
     {

    
    
    @Mapping("initWithReuseIdentifier:")
    public UITableViewHeaderFooterView(String reuseIdentifier) { }
    @Mapping("initWithFrame:")
    public UITableViewHeaderFooterView(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UITableViewHeaderFooterView(NSCoder aDecoder) { }
    @Mapping("init")
    public UITableViewHeaderFooterView() { }
    
    
    @Mapping("tintColor")
    public native UIColor getTintColor();
    @Mapping("setTintColor:")
    public native void setTintColor(UIColor v);
    @Mapping("textLabel")
    public native UILabel getTextLabel();
    @Mapping("detailTextLabel")
    public native UILabel getDetailTextLabel();
    @Mapping("contentView")
    public native UIView getContentView();
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    @Mapping("setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Mapping("reuseIdentifier")
    public native String getReuseIdentifier();
    
    
    
    @Mapping("prepareForReuse")
    public native void prepareForReuse();
    
}
