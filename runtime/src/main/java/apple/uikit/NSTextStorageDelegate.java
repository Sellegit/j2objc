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





@Library("UIKit") @Mapping("NSTextStorageDelegate")
public interface NSTextStorageDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textStorage:willProcessEditing:range:changeInLength:")
    void willProcessEditing(NSTextStorage textStorage, @Representing("NSTextStorageEditActions") @MachineSizedUInt long editedMask, NSRange editedRange, @MachineSizedSInt long delta);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("textStorage:didProcessEditing:range:changeInLength:")
    void didProcessEditing(NSTextStorage textStorage, @Representing("NSTextStorageEditActions") @MachineSizedUInt long editedMask, NSRange editedRange, @MachineSizedSInt long delta);
    
    /*<adapter>*/
    /*</adapter>*/
}
