package apple.coregraphics;


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
import apple.uikit.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreGraphics")
public class CGContext 
    extends CFType 
     {

    
    
    protected CGContext() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetTypeID")
    public static native @MachineSizedUInt long getClassTypeID();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSaveGState")
    public native void saveGState();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextRestoreGState")
    public native void restoreGState();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextScaleCTM")
    public native void scaleCTM(@MachineSizedFloat double sx, @MachineSizedFloat double sy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextTranslateCTM")
    public native void translateCTM(@MachineSizedFloat double tx, @MachineSizedFloat double ty);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextRotateCTM")
    public native void rotateCTM(@MachineSizedFloat double angle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConcatCTM")
    public native void concatCTM(CGAffineTransform transform);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetCTM")
    public native CGAffineTransform getCTM();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineWidth")
    public native void setLineWidth(@MachineSizedFloat double width);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineCap")
    public native void setLineCap(CGLineCap cap);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineJoin")
    public native void setLineJoin(CGLineJoin join);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetMiterLimit")
    public native void setMiterLimit(@MachineSizedFloat double limit);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineDash")
    protected native void setLineDash(@MachineSizedFloat double phase, Todo lengths, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFlatness")
    public native void setFlatness(@MachineSizedFloat double flatness);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAlpha")
    public native void setAlpha(@MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetBlendMode")
    public native void setBlendMode(CGBlendMode mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginPath")
    public native void beginPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextMoveToPoint")
    public native void moveToPoint(@MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddLineToPoint")
    public native void addLineToPoint(@MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddCurveToPoint")
    public native void addCurveToPoint(@MachineSizedFloat double cp1x, @MachineSizedFloat double cp1y, @MachineSizedFloat double cp2x, @MachineSizedFloat double cp2y, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddQuadCurveToPoint")
    public native void addQuadCurveToPoint(@MachineSizedFloat double cpx, @MachineSizedFloat double cpy, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClosePath")
    public native void closePath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddRect")
    public native void addRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddRects")
    protected native void addRects(CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddLines")
    protected native void addLines(CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddEllipseInRect")
    public native void addEllipseInRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddArc")
    public native void addArc(@MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, int clockwise);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddArcToPoint")
    public native void addArcToPoint(@MachineSizedFloat double x1, @MachineSizedFloat double y1, @MachineSizedFloat double x2, @MachineSizedFloat double y2, @MachineSizedFloat double radius);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddPath")
    public native void addPath(CGPath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextReplacePathWithStrokedPath")
    public native void replacePathWithStrokedPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextIsPathEmpty")
    public native boolean isPathEmpty();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetPathCurrentPoint")
    public native CGPoint getPathCurrentPoint();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetPathBoundingBox")
    public native CGRect getPathBoundingBox();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextCopyPath")
    public native CGPath getPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextPathContainsPoint")
    public native boolean pathContainsPoint(CGPoint point, CGPathDrawingMode mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawPath")
    public native void drawPath(CGPathDrawingMode mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillPath")
    public native void fillPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEOFillPath")
    public native void evenOddFillPath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokePath")
    public native void strokePath();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillRect")
    public native void fillRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillRects")
    protected native void fillRects(CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeRect")
    public native void strokeRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeRectWithWidth")
    public native void strokeRectWithWidth(CGRect rect, @MachineSizedFloat double width);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClearRect")
    public native void clearRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillEllipseInRect")
    public native void fillEllipseInRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeEllipseInRect")
    public native void strokeEllipseInRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeLineSegments")
    protected native void strokeLineSegments(CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClip")
    public native void clip();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEOClip")
    public native void evenOddClip();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToMask")
    public native void clipToMask(CGRect rect, CGImage mask);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetClipBoundingBox")
    public native CGRect getClipBoundingBox();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToRect")
    public native void clipToRect(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToRects")
    protected native void clipToRects(CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColorWithColor")
    public native void setFillColorWithColor(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColorWithColor")
    public native void setStrokeColorWithColor(CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColorSpace")
    public native void setFillColorSpace(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColorSpace")
    public native void setStrokeColorSpace(CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColor")
    protected native void setFillColor(Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColor")
    protected native void setStrokeColor(Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillPattern")
    protected native void setFillPattern(CGPattern pattern, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokePattern")
    protected native void setStrokePattern(CGPattern pattern, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetPatternPhase")
    public native void setPatternPhase(CGSize phase);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetGrayFillColor")
    public native void setGrayFillColor(@MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetGrayStrokeColor")
    public native void setGrayStrokeColor(@MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRGBFillColor")
    public native void setRGBFillColor(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRGBStrokeColor")
    public native void setRGBStrokeColor(@MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCMYKFillColor")
    public native void setCMYKFillColor(@MachineSizedFloat double cyan, @MachineSizedFloat double magenta, @MachineSizedFloat double yellow, @MachineSizedFloat double black, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCMYKStrokeColor")
    public native void setCMYKStrokeColor(@MachineSizedFloat double cyan, @MachineSizedFloat double magenta, @MachineSizedFloat double yellow, @MachineSizedFloat double black, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRenderingIntent")
    public native void setRenderingIntent(CGColorRenderingIntent intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawImage")
    public native void drawImage(CGRect rect, CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawTiledImage")
    public native void drawTiledImage(CGRect rect, CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetInterpolationQuality")
    public native CGInterpolationQuality getInterpolationQuality();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetInterpolationQuality")
    public native void setInterpolationQuality(CGInterpolationQuality quality);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShadowWithColor")
    public native void setShadowWithColor(CGSize offset, @MachineSizedFloat double blur, CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShadow")
    public native void setShadow(CGSize offset, @MachineSizedFloat double blur);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLinearGradient")
    public native void drawLinearGradient(CGGradient gradient, CGPoint startPoint, CGPoint endPoint, CGGradientDrawingOptions options);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawRadialGradient")
    public native void drawRadialGradient(CGGradient gradient, CGPoint startCenter, @MachineSizedFloat double startRadius, CGPoint endCenter, @MachineSizedFloat double endRadius, CGGradientDrawingOptions options);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawShading")
    public native void drawShading(CGShading shading);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCharacterSpacing")
    public native void setCharacterSpacing(@MachineSizedFloat double spacing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextPosition")
    public native void setTextPosition(@MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetTextPosition")
    public native CGPoint getTextPosition();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextMatrix")
    public native void setTextMatrix(CGAffineTransform t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetTextMatrix")
    public native CGAffineTransform getTextMatrix();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextDrawingMode")
    public native void setTextDrawingMode(CGTextDrawingMode mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFont")
    public native void setFont(CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFontSize")
    public native void setFontSize(@MachineSizedFloat double size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextShowGlyphsAtPositions")
    protected native void showGlyphsAtPositions(Todo glyphs, CGPoint positions, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawPDFPage")
    public native void drawPDFPage(CGPDFPage page);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginPage")
    public native void beginPage(CGRect mediaBox);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEndPage")
    public native void endPage();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFlush")
    public native void flush();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSynchronize")
    public native void synchronize();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldAntialias")
    public native void setShouldAntialias(boolean shouldAntialias);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsAntialiasing")
    public native void setAllowsAntialiasing(boolean allowsAntialiasing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSmoothFonts")
    public native void setShouldSmoothFonts(boolean shouldSmoothFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSmoothing")
    public native void setAllowsFontSmoothing(boolean allowsFontSmoothing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSubpixelPositionFonts")
    public native void setShouldSubpixelPositionFonts(boolean shouldSubpixelPositionFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSubpixelPositioning")
    public native void setAllowsFontSubpixelPositioning(boolean allowsFontSubpixelPositioning);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSubpixelQuantizeFonts")
    public native void setShouldSubpixelQuantizeFonts(boolean shouldSubpixelQuantizeFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSubpixelQuantization")
    public native void setAllowsFontSubpixelQuantization(boolean allowsFontSubpixelQuantization);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginTransparencyLayer")
    public native void beginTransparencyLayer(NSDictionary<?, ?> auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginTransparencyLayerWithRect")
    public native void beginTransparencyLayerWithRect(CGRect rect, NSDictionary<?, ?> auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEndTransparencyLayer")
    public native void endTransparencyLayer();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetUserSpaceToDeviceSpaceTransform")
    public native CGAffineTransform getUserSpaceToDeviceSpaceTransform();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertPointToDeviceSpace")
    public native CGPoint convertPointToDeviceSpace(CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertPointToUserSpace")
    public native CGPoint convertPointToUserSpace(CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertSizeToDeviceSpace")
    public native CGSize convertSizeToDeviceSpace(CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertSizeToUserSpace")
    public native CGSize convertSizeToUserSpace(CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertRectToDeviceSpace")
    public native CGRect convertRectToDeviceSpace(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertRectToUserSpace")
    public native CGRect convertRectToUserSpace(CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextSelectFont")
    protected native void selectFont(Todo name, @MachineSizedFloat double size, CGTextEncoding textEncoding);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowText")
    protected native void showText(Todo string, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowTextAtPoint")
    protected native void showTextAtPoint(@MachineSizedFloat double x, @MachineSizedFloat double y, Todo string, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphs")
    protected native void showGlyphs(Todo g, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphsAtPoint")
    protected native void showGlyphsAtPoint(@MachineSizedFloat double x, @MachineSizedFloat double y, Todo glyphs, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphsWithAdvances")
    protected native void showGlyphsWithAdvances(Todo glyphs, CGSize advances, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLayerInRect")
    public native void drawLayerInRect(CGRect rect, CGLayer layer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLayerAtPoint")
    public native void drawLayerAtPoint(CGPoint point, CGLayer layer);
    
}
