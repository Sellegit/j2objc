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

@Library("UIKit/UIKit.h") @Mapping("UIPrintPageRenderer")
public class UIPrintPageRenderer 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public UIPrintPageRenderer() { }
    
    
    @Mapping("headerHeight")
    public native @MachineSizedFloat double getHeaderHeight();
    @Mapping("setHeaderHeight:")
    public native void setHeaderHeight(@MachineSizedFloat double v);
    @Mapping("footerHeight")
    public native @MachineSizedFloat double getFooterHeight();
    @Mapping("setFooterHeight:")
    public native void setFooterHeight(@MachineSizedFloat double v);
    @Mapping("paperRect")
    public native CGRect getPaperRect();
    @Mapping("printableRect")
    public native CGRect getPrintableRect();
    @Mapping("printFormatters")
    public native NSArray<UIPrintFormatter> getPrintFormatters();
    @Mapping("setPrintFormatters:")
    public native void setPrintFormatters(NSArray<UIPrintFormatter> v);
    
    
    
    @Mapping("printFormattersForPageAtIndex:")
    public native NSArray<UIPrintFormatter> getPrintFormatters(@MachineSizedSInt long pageIndex);
    @Mapping("addPrintFormatter:startingAtPageAtIndex:")
    public native void addPrintFormatter(UIPrintFormatter formatter, @MachineSizedSInt long pageIndex);
    @Mapping("numberOfPages")
    public native @MachineSizedSInt long getNumberOfPages();
    @Mapping("prepareForDrawingPages:")
    public native void prepareForDrawingPages(NSRange range);
    @Mapping("drawPageAtIndex:inRect:")
    public native void drawPage(@MachineSizedSInt long pageIndex, CGRect printableRect);
    @Mapping("drawPrintFormatter:forPageAtIndex:")
    public native void drawPrintFormatter(UIPrintFormatter printFormatter, @MachineSizedSInt long pageIndex);
    @Mapping("drawHeaderForPageAtIndex:inRect:")
    public native void drawHeader(@MachineSizedSInt long pageIndex, CGRect headerRect);
    @Mapping("drawContentForPageAtIndex:inRect:")
    public native void drawContent(@MachineSizedSInt long pageIndex, CGRect contentRect);
    @Mapping("drawFooterForPageAtIndex:inRect:")
    public native void drawFooter(@MachineSizedSInt long pageIndex, CGRect footerRect);
    
}
