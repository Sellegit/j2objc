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
 * @since Available in iOS 7.0 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("NSTextStorage")
public class NSTextStorage 
    extends NSMutableAttributedString 
     {

    
    
    @Mapping("init")
    public NSTextStorage() { }

    
    @Mapping("layoutManagers")
    public native NSArray<NSLayoutManager> getLayoutManagers();
    @Mapping("editedMask")
    public native @Representing("NSTextStorageEditActions") long getEditedMask();
    @Mapping("setEditedMask:")
    public native void setEditedMask(@Representing("NSTextStorageEditActions") long v);
    @Mapping("editedRange")
    public native NSRange getEditedRange();
    @Mapping("setEditedRange:")
    public native void setEditedRange(NSRange v);
    @Mapping("changeInLength")
    public native @MachineSizedSInt long getChangeInLength();
    @Mapping("setChangeInLength:")
    public native void setChangeInLength(@MachineSizedSInt long v);
    @Mapping("delegate")
    public native NSTextStorageDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(NSTextStorageDelegate v);
    @Mapping("fixesAttributesLazily")
    public native boolean fixesAttributesLazily();

    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSTextStorageWillProcessEditingNotification")
    public static native String WillProcessEditingNotification();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @GlobalConstant("NSTextStorageDidProcessEditingNotification")
    public static native String DidProcessEditingNotification();

    @Mapping("addLayoutManager:")
    public native void addLayoutManager(NSLayoutManager aLayoutManager);
    @Mapping("removeLayoutManager:")
    public native void removeLayoutManager(NSLayoutManager aLayoutManager);
    @Mapping("edited:range:changeInLength:")
    public native void edited(@Representing("NSTextStorageEditActions") long editedMask, NSRange editedRange, @MachineSizedSInt long delta);
    @Mapping("processEditing")
    public native void processEditing();
    @Mapping("invalidateAttributesInRange:")
    public native void invalidateAttributes(NSRange range);
    @Mapping("ensureAttributesAreFixedInRange:")
    public native void ensureAttributesAreFixed(NSRange range);

}
