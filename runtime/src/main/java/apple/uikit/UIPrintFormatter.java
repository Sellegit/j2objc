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
 * @since Available in iOS 4.2 and later.
 */
@Library("UIKit/UIKit.h") @Mapping("UIPrintFormatter")
public class UIPrintFormatter 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public UIPrintFormatter() { }

    
    @Mapping("printPageRenderer")
    public native UIPrintPageRenderer getPrintPageRenderer();
    @Mapping("maximumContentHeight")
    public native @MachineSizedFloat double getMaximumContentHeight();
    @Mapping("setMaximumContentHeight:")
    public native void setMaximumContentHeight(@MachineSizedFloat double v);
    @Mapping("maximumContentWidth")
    public native @MachineSizedFloat double getMaximumContentWidth();
    @Mapping("setMaximumContentWidth:")
    public native void setMaximumContentWidth(@MachineSizedFloat double v);
    @Mapping("contentInsets")
    public native UIEdgeInsets getContentInsets();
    @Mapping("setContentInsets:")
    public native void setContentInsets(UIEdgeInsets v);
    @Mapping("perPageContentInsets")
    public native UIEdgeInsets getPerPageContentInsets();
    @Mapping("setPerPageContentInsets:")
    public native void setPerPageContentInsets(UIEdgeInsets v);
    @Mapping("startPage")
    public native @MachineSizedSInt long getStartPage();
    @Mapping("setStartPage:")
    public native void setStartPage(@MachineSizedSInt long v);
    @Mapping("pageCount")
    public native @MachineSizedSInt long getPageCount();

    
    
    @Mapping("removeFromPrintPageRenderer")
    public native void removeFromPrintPageRenderer();
    @Mapping("rectForPageAtIndex:")
    public native CGRect getRectForPage(@MachineSizedSInt long pageIndex);
    @Mapping("drawInRect:forPageAtIndex:")
    public native void draw(CGRect rect, @MachineSizedSInt long pageIndex);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
