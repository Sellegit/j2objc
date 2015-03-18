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
 * @since Available in iOS 2.0 and later.
 */

@Library("UIKit/UIKit.h") @Mapping("UITableViewCell")
public class UITableViewCell 
    extends UIView 
    implements NSCoding, UIGestureRecognizerDelegate {

    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("initWithStyle:reuseIdentifier:")
    public UITableViewCell(@Representing("UITableViewCellStyle") @MachineSizedSInt long style, String reuseIdentifier) { }
    @Mapping("initWithFrame:")
    public UITableViewCell(CGRect frame) { }
    @Mapping("init")
    public UITableViewCell() { }
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("imageView")
    public native UIImageView getImageView();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("textLabel")
    public native UILabel getTextLabel();
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("detailTextLabel")
    public native UILabel getDetailTextLabel();
    @Mapping("contentView")
    public native UIView getContentView();
    @Mapping("backgroundView")
    public native UIView getBackgroundView();
    @Mapping("setBackgroundView:")
    public native void setBackgroundView(UIView v);
    @Mapping("selectedBackgroundView")
    public native UIView getSelectedBackgroundView();
    @Mapping("setSelectedBackgroundView:")
    public native void setSelectedBackgroundView(UIView v);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("multipleSelectionBackgroundView")
    public native UIView getMultipleSelectionBackgroundView();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("setMultipleSelectionBackgroundView:")
    public native void setMultipleSelectionBackgroundView(UIView v);
    @Mapping("reuseIdentifier")
    public native String getReuseIdentifier();
    @Mapping("selectionStyle")
    public native @Representing("UITableViewCellSelectionStyle") @MachineSizedSInt long getSelectionStyle();
    @Mapping("setSelectionStyle:")
    public native void setSelectionStyle(@Representing("UITableViewCellSelectionStyle") @MachineSizedSInt long v);
    @Mapping("isSelected")
    public native boolean isSelected();
    @Mapping("setSelected:")
    public native void setSelected(boolean v);
    @Mapping("isHighlighted")
    public native boolean isHighlighted();
    @Mapping("setHighlighted:")
    public native void setHighlighted(boolean v);
    @Mapping("editingStyle")
    public native @Representing("UITableViewCellEditingStyle") @MachineSizedSInt long getEditingStyle();
    @Mapping("showsReorderControl")
    public native boolean showsReorderControl();
    @Mapping("setShowsReorderControl:")
    public native void setShowsReorderControl(boolean v);
    @Mapping("shouldIndentWhileEditing")
    public native boolean shouldIndentWhileEditing();
    @Mapping("setShouldIndentWhileEditing:")
    public native void setShouldIndentWhileEditing(boolean v);
    @Mapping("accessoryType")
    public native @Representing("UITableViewCellAccessoryType") @MachineSizedSInt long getAccessoryType();
    @Mapping("setAccessoryType:")
    public native void setAccessoryType(@Representing("UITableViewCellAccessoryType") @MachineSizedSInt long v);
    @Mapping("accessoryView")
    public native UIView getAccessoryView();
    @Mapping("setAccessoryView:")
    public native void setAccessoryView(UIView v);
    @Mapping("editingAccessoryType")
    public native @Representing("UITableViewCellAccessoryType") @MachineSizedSInt long getEditingAccessoryType();
    @Mapping("setEditingAccessoryType:")
    public native void setEditingAccessoryType(@Representing("UITableViewCellAccessoryType") @MachineSizedSInt long v);
    @Mapping("editingAccessoryView")
    public native UIView getEditingAccessoryView();
    @Mapping("setEditingAccessoryView:")
    public native void setEditingAccessoryView(UIView v);
    @Mapping("indentationLevel")
    public native @MachineSizedSInt long getIndentationLevel();
    @Mapping("setIndentationLevel:")
    public native void setIndentationLevel(@MachineSizedSInt long v);
    @Mapping("indentationWidth")
    public native @MachineSizedFloat double getIndentationWidth();
    @Mapping("setIndentationWidth:")
    public native void setIndentationWidth(@MachineSizedFloat double v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("separatorInset")
    public native UIEdgeInsets getSeparatorInset();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setSeparatorInset:")
    public native void setSeparatorInset(UIEdgeInsets v);
    @Mapping("isEditing")
    public native boolean isEditing();
    @Mapping("setEditing:")
    public native void setEditing(boolean v);
    @Mapping("showingDeleteConfirmation")
    public native boolean isShowingDeleteConfirmation();
    
    
    
    @Mapping("prepareForReuse")
    public native void prepareForReuse();
    @Mapping("setSelected:animated:")
    public native void setSelected(boolean selected, boolean animated);
    @Mapping("setHighlighted:animated:")
    public native void setHighlighted(boolean highlighted, boolean animated);
    @Mapping("setEditing:animated:")
    public native void setEditing(boolean editing, boolean animated);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("willTransitionToState:")
    public native void willTransitionToState(@Representing("UITableViewCellStateMask") @MachineSizedUInt long state);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("didTransitionToState:")
    public native void didTransitionToState(@Representing("UITableViewCellStateMask") @MachineSizedUInt long state);
    @Mapping("gestureRecognizerShouldBegin:")
    public native boolean shouldBegin(UIGestureRecognizer gestureRecognizer);
    @Mapping("gestureRecognizer:shouldRecognizeSimultaneouslyWithGestureRecognizer:")
    public native boolean shouldRecognizeSimultaneously(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("gestureRecognizer:shouldRequireFailureOfGestureRecognizer:")
    public native boolean shouldRequireFailure(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("gestureRecognizer:shouldBeRequiredToFailByGestureRecognizer:")
    public native boolean shouldBeRequiredToFail(UIGestureRecognizer gestureRecognizer, UIGestureRecognizer otherGestureRecognizer);
    @Mapping("gestureRecognizer:shouldReceiveTouch:")
    public native boolean shouldReceiveTouch(UIGestureRecognizer gestureRecognizer, UITouch touch);
    
}
