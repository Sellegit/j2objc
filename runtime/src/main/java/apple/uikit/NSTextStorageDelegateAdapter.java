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

/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class NSTextStorageDelegateAdapter 
    extends Object 
    implements NSTextStorageDelegate {

    
    
    


    
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textStorage:willProcessEditing:range:changeInLength:")
    public void willProcessEditing(NSTextStorage textStorage, @Representing("NSTextStorageEditActions") long editedMask, NSRange editedRange, @MachineSizedSInt long delta) { throw new UnsupportedOperationException(); }
    /**
     * @since Available in iOS 7.0 and later.
     */
    @NotImplemented("textStorage:didProcessEditing:range:changeInLength:")
    public void didProcessEditing(NSTextStorage textStorage, @Representing("NSTextStorageEditActions") long editedMask, NSRange editedRange, @MachineSizedSInt long delta) { throw new UnsupportedOperationException(); }

}
