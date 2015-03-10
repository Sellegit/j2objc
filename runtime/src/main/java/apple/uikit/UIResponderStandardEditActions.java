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





@Library("UIKit") @Mapping("UIResponderStandardEditActions")
public interface UIResponderStandardEditActions 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("cut:")
    void cut(Object sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("copy:")
    void copy(Object sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("paste:")
    void paste(Object sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("select:")
    void select(Object sender);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("selectAll:")
    void selectAll(Object sender);
    /**
     * @since Available in iOS 3.2 and later.
     */
    @Mapping("delete:")
    void delete(Object sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("makeTextWritingDirectionLeftToRight:")
    void makeTextWritingDirectionLeftToRight(Object sender);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("makeTextWritingDirectionRightToLeft:")
    void makeTextWritingDirectionRightToLeft(Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("toggleBoldface:")
    void toggleBoldface(Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("toggleItalics:")
    void toggleItalics(Object sender);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("toggleUnderline:")
    void toggleUnderline(Object sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("increaseSize:")
    void increaseSize(Object sender);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("decreaseSize:")
    void decreaseSize(Object sender);
    
    /*<adapter>*/
    /*</adapter>*/
}
