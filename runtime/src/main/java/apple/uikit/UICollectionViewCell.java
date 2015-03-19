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

@Library("UIKit/UIKit.h") @Mapping("UICollectionViewCell")
public class UICollectionViewCell 
    extends UICollectionReusableView 
     {

    
    
    @Mapping("initWithFrame:")
    public UICollectionViewCell(CGRect frame) { }
    @Mapping("initWithCoder:")
    public UICollectionViewCell(NSCoder aDecoder) { }
    @Mapping("init")
    public UICollectionViewCell() { }
    
    
    @Mapping("contentView")
    public native UIView getContentView();
    @Mapping("isSelected")
    public native boolean isSelected();
    @Mapping("setSelected:")
    public native void setSelected(boolean v);
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    @Mapping("setHighlighted:")
    public native void setHighlighted(boolean v);
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    @Mapping("setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Mapping("selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @Mapping("setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    
    
    
    
    
}
