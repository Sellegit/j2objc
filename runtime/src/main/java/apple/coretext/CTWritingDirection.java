package apple.coretext;


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





@Library("CoreText/CoreText.h")
@Mapping("CTWritingDirection")
public final class CTWritingDirection extends ObjCEnum {
    
    @GlobalConstant("kCTWritingDirectionNatural")
    public static final long Natural = -1L;
    @GlobalConstant("kCTWritingDirectionLeftToRight")
    public static final long LeftToRight = 0L;
    @GlobalConstant("kCTWritingDirectionRightToLeft")
    public static final long RightToLeft = 1L;
    

}
