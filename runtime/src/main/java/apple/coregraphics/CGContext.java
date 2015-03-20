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
@Mapping("CGContextRef") @Library("CoreGraphics/CoreGraphics.h")
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
    public static native void saveGState(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextRestoreGState")
    public static native void restoreGState(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextScaleCTM")
    public static native void scaleCTM(CGContext c, @MachineSizedFloat double sx, @MachineSizedFloat double sy);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextTranslateCTM")
    public static native void translateCTM(CGContext c, @MachineSizedFloat double tx, @MachineSizedFloat double ty);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextRotateCTM")
    public static native void rotateCTM(CGContext c, @MachineSizedFloat double angle);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConcatCTM")
    public static native void concatCTM(CGContext c, CGAffineTransform transform);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetCTM")
    public static native CGAffineTransform getCTM(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineWidth")
    public static native void setLineWidth(CGContext c, @MachineSizedFloat double width);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineCap")
    public static native void setLineCap(CGContext c, @Representing("CGLineCap") long cap);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineJoin")
    public static native void setLineJoin(CGContext c, @Representing("CGLineJoin") long join);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetMiterLimit")
    public static native void setMiterLimit(CGContext c, @MachineSizedFloat double limit);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetLineDash")
    public static native void setLineDash(CGContext c, @MachineSizedFloat double phase, Todo lengths, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFlatness")
    public static native void setFlatness(CGContext c, @MachineSizedFloat double flatness);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAlpha")
    public static native void setAlpha(CGContext c, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetBlendMode")
    public static native void setBlendMode(CGContext context, @Representing("CGBlendMode") long mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginPath")
    public static native void beginPath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextMoveToPoint")
    public static native void moveToPoint(CGContext c, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddLineToPoint")
    public static native void addLineToPoint(CGContext c, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddCurveToPoint")
    public static native void addCurveToPoint(CGContext c, @MachineSizedFloat double cp1x, @MachineSizedFloat double cp1y, @MachineSizedFloat double cp2x, @MachineSizedFloat double cp2y, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddQuadCurveToPoint")
    public static native void addQuadCurveToPoint(CGContext c, @MachineSizedFloat double cpx, @MachineSizedFloat double cpy, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClosePath")
    public static native void closePath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddRect")
    public static native void addRect(CGContext c, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddRects")
    public static native void addRects(CGContext c, CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddLines")
    public static native void addLines(CGContext c, CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddEllipseInRect")
    public static native void addEllipseInRect(CGContext context, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddArc")
    public static native void addArc(CGContext c, @MachineSizedFloat double x, @MachineSizedFloat double y, @MachineSizedFloat double radius, @MachineSizedFloat double startAngle, @MachineSizedFloat double endAngle, int clockwise);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddArcToPoint")
    public static native void addArcToPoint(CGContext c, @MachineSizedFloat double x1, @MachineSizedFloat double y1, @MachineSizedFloat double x2, @MachineSizedFloat double y2, @MachineSizedFloat double radius);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextAddPath")
    public static native void addPath(CGContext context, CGPath path);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextReplacePathWithStrokedPath")
    public static native void replacePathWithStrokedPath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextIsPathEmpty")
    public static native boolean isPathEmpty(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetPathCurrentPoint")
    public static native CGPoint getPathCurrentPoint(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetPathBoundingBox")
    public static native CGRect getPathBoundingBox(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextCopyPath")
    public static native CGPath getPath(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextPathContainsPoint")
    public static native boolean pathContainsPoint(CGContext context, CGPoint point, @Representing("CGPathDrawingMode") long mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawPath")
    public static native void drawPath(CGContext c, @Representing("CGPathDrawingMode") long mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillPath")
    public static native void fillPath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEOFillPath")
    public static native void evenOddFillPath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokePath")
    public static native void strokePath(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillRect")
    public static native void fillRect(CGContext c, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillRects")
    public static native void fillRects(CGContext c, CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeRect")
    public static native void strokeRect(CGContext c, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeRectWithWidth")
    public static native void strokeRectWithWidth(CGContext c, CGRect rect, @MachineSizedFloat double width);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClearRect")
    public static native void clearRect(CGContext c, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFillEllipseInRect")
    public static native void fillEllipseInRect(CGContext context, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeEllipseInRect")
    public static native void strokeEllipseInRect(CGContext context, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextStrokeLineSegments")
    public static native void strokeLineSegments(CGContext c, CGPoint points, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClip")
    public static native void clip(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEOClip")
    public static native void evenOddClip(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToMask")
    public static native void clipToMask(CGContext c, CGRect rect, CGImage mask);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetClipBoundingBox")
    public static native CGRect getClipBoundingBox(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToRect")
    public static native void clipToRect(CGContext c, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextClipToRects")
    public static native void clipToRects(CGContext c, CGRect rects, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColorWithColor")
    public static native void setFillColorWithColor(CGContext c, CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColorWithColor")
    public static native void setStrokeColorWithColor(CGContext c, CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColorSpace")
    public static native void setFillColorSpace(CGContext context, CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColorSpace")
    public static native void setStrokeColorSpace(CGContext context, CGColorSpace space);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillColor")
    public static native void setFillColor(CGContext context, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokeColor")
    public static native void setStrokeColor(CGContext context, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFillPattern")
    public static native void setFillPattern(CGContext context, CGPattern pattern, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetStrokePattern")
    public static native void setStrokePattern(CGContext context, CGPattern pattern, Todo components);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetPatternPhase")
    public static native void setPatternPhase(CGContext context, CGSize phase);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetGrayFillColor")
    public static native void setGrayFillColor(CGContext context, @MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetGrayStrokeColor")
    public static native void setGrayStrokeColor(CGContext context, @MachineSizedFloat double gray, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRGBFillColor")
    public static native void setRGBFillColor(CGContext context, @MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRGBStrokeColor")
    public static native void setRGBStrokeColor(CGContext context, @MachineSizedFloat double red, @MachineSizedFloat double green, @MachineSizedFloat double blue, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCMYKFillColor")
    public static native void setCMYKFillColor(CGContext context, @MachineSizedFloat double cyan, @MachineSizedFloat double magenta, @MachineSizedFloat double yellow, @MachineSizedFloat double black, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCMYKStrokeColor")
    public static native void setCMYKStrokeColor(CGContext context, @MachineSizedFloat double cyan, @MachineSizedFloat double magenta, @MachineSizedFloat double yellow, @MachineSizedFloat double black, @MachineSizedFloat double alpha);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetRenderingIntent")
    public static native void setRenderingIntent(CGContext context, @Representing("CGColorRenderingIntent") long intent);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawImage")
    public static native void drawImage(CGContext c, CGRect rect, CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawTiledImage")
    public static native void drawTiledImage(CGContext c, CGRect rect, CGImage image);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetInterpolationQuality")
    public static native CGInterpolationQuality getInterpolationQuality(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetInterpolationQuality")
    public static native void setInterpolationQuality(CGContext context, @Representing("CGInterpolationQuality") long quality);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShadowWithColor")
    public static native void setShadowWithColor(CGContext context, CGSize offset, @MachineSizedFloat double blur, CGColor color);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShadow")
    public static native void setShadow(CGContext context, CGSize offset, @MachineSizedFloat double blur);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLinearGradient")
    public static native void drawLinearGradient(CGContext context, CGGradient gradient, CGPoint startPoint, CGPoint endPoint, @Representing("CGGradientDrawingOptions") long options);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawRadialGradient")
    public static native void drawRadialGradient(CGContext context, CGGradient gradient, CGPoint startCenter, @MachineSizedFloat double startRadius, CGPoint endCenter, @MachineSizedFloat double endRadius, @Representing("CGGradientDrawingOptions") long options);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawShading")
    public static native void drawShading(CGContext context, CGShading shading);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetCharacterSpacing")
    public static native void setCharacterSpacing(CGContext context, @MachineSizedFloat double spacing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextPosition")
    public static native void setTextPosition(CGContext c, @MachineSizedFloat double x, @MachineSizedFloat double y);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetTextPosition")
    public static native CGPoint getTextPosition(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextMatrix")
    public static native void setTextMatrix(CGContext c, CGAffineTransform t);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetTextMatrix")
    public static native CGAffineTransform getTextMatrix(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetTextDrawingMode")
    public static native void setTextDrawingMode(CGContext c, @Representing("CGTextDrawingMode") long mode);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFont")
    public static native void setFont(CGContext c, CGFont font);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetFontSize")
    public static native void setFontSize(CGContext c, @MachineSizedFloat double size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextShowGlyphsAtPositions")
    public static native void showGlyphsAtPositions(CGContext context, Todo glyphs, CGPoint positions, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawPDFPage")
    public static native void drawPDFPage(CGContext c, CGPDFPage page);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginPage")
    public static native void beginPage(CGContext c, CGRect mediaBox);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEndPage")
    public static native void endPage(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextFlush")
    public static native void flush(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSynchronize")
    public static native void synchronize(CGContext c);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldAntialias")
    public static native void setShouldAntialias(CGContext context, boolean shouldAntialias);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsAntialiasing")
    public static native void setAllowsAntialiasing(CGContext context, boolean allowsAntialiasing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSmoothFonts")
    public static native void setShouldSmoothFonts(CGContext context, boolean shouldSmoothFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSmoothing")
    public static native void setAllowsFontSmoothing(CGContext context, boolean allowsFontSmoothing);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSubpixelPositionFonts")
    public static native void setShouldSubpixelPositionFonts(CGContext context, boolean shouldSubpixelPositionFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSubpixelPositioning")
    public static native void setAllowsFontSubpixelPositioning(CGContext context, boolean allowsFontSubpixelPositioning);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetShouldSubpixelQuantizeFonts")
    public static native void setShouldSubpixelQuantizeFonts(CGContext context, boolean shouldSubpixelQuantizeFonts);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextSetAllowsFontSubpixelQuantization")
    public static native void setAllowsFontSubpixelQuantization(CGContext context, boolean allowsFontSubpixelQuantization);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginTransparencyLayer")
    public static native void beginTransparencyLayer(CGContext context, CFDictionary auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextBeginTransparencyLayerWithRect")
    public static native void beginTransparencyLayerWithRect(CGContext context, CGRect rect, CFDictionary auxiliaryInfo);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextEndTransparencyLayer")
    public static native void endTransparencyLayer(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextGetUserSpaceToDeviceSpaceTransform")
    public static native CGAffineTransform getUserSpaceToDeviceSpaceTransform(CGContext context);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertPointToDeviceSpace")
    public static native CGPoint convertPointToDeviceSpace(CGContext context, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertPointToUserSpace")
    public static native CGPoint convertPointToUserSpace(CGContext context, CGPoint point);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertSizeToDeviceSpace")
    public static native CGSize convertSizeToDeviceSpace(CGContext context, CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertSizeToUserSpace")
    public static native CGSize convertSizeToUserSpace(CGContext context, CGSize size);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertRectToDeviceSpace")
    public static native CGRect convertRectToDeviceSpace(CGContext context, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextConvertRectToUserSpace")
    public static native CGRect convertRectToUserSpace(CGContext context, CGRect rect);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextSelectFont")
    public static native void selectFont(CGContext c, Todo name, @MachineSizedFloat double size, @Representing("CGTextEncoding") long textEncoding);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowText")
    public static native void showText(CGContext c, Todo string, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowTextAtPoint")
    public static native void showTextAtPoint(CGContext c, @MachineSizedFloat double x, @MachineSizedFloat double y, Todo string, @MachineSizedUInt long length);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphs")
    public static native void showGlyphs(CGContext c, Todo g, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphsAtPoint")
    public static native void showGlyphsAtPoint(CGContext context, @MachineSizedFloat double x, @MachineSizedFloat double y, Todo glyphs, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     * @deprecated Deprecated in iOS 7.0.
     */
    @Deprecated
    @GlobalFunction("CGContextShowGlyphsWithAdvances")
    public static native void showGlyphsWithAdvances(CGContext context, Todo glyphs, CGSize advances, @MachineSizedUInt long count);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLayerInRect")
    public static native void drawLayerInRect(CGContext context, CGRect rect, CGLayer layer);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CGContextDrawLayerAtPoint")
    public static native void drawLayerAtPoint(CGContext context, CGPoint point, CGLayer layer);
    
}
