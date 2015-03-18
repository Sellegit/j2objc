package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Mapping("CFUUIDBytes") @Library("CoreFoundation/CoreFoundation.h")
public class CFUUIDBytes 
    extends Struct 
     {

    
    private CFUUIDBytes() {}
    
    
    @DotMapping("byte0")
    public native byte getByte0();
    @DotMapping("byte1")
    public native byte getByte1();
    @DotMapping("byte2")
    public native byte getByte2();
    @DotMapping("byte3")
    public native byte getByte3();
    @DotMapping("byte4")
    public native byte getByte4();
    @DotMapping("byte5")
    public native byte getByte5();
    @DotMapping("byte6")
    public native byte getByte6();
    @DotMapping("byte7")
    public native byte getByte7();
    @DotMapping("byte8")
    public native byte getByte8();
    @DotMapping("byte9")
    public native byte getByte9();
    @DotMapping("byte10")
    public native byte getByte10();
    @DotMapping("byte11")
    public native byte getByte11();
    @DotMapping("byte12")
    public native byte getByte12();
    @DotMapping("byte13")
    public native byte getByte13();
    @DotMapping("byte14")
    public native byte getByte14();
    @DotMapping("byte15")
    public native byte getByte15();
    
    public static native CFUUIDBytes create(byte byte0, byte byte1, byte byte2, byte byte3, byte byte4, byte byte5, byte byte6, byte byte7, byte byte8, byte byte9, byte byte10, byte byte11, byte byte12, byte byte13, byte byte14, byte byte15) /*-[
        CFUUIDBytes __new = { .byte0 = byte0, .byte1 = byte1, .byte2 = byte2, .byte3 = byte3, .byte4 = byte4, .byte5 = byte5, .byte6 = byte6, .byte7 = byte7, .byte8 = byte8, .byte9 = byte9, .byte10 = byte10, .byte11 = byte11, .byte12 = byte12, .byte13 = byte13, .byte14 = byte14, .byte15 = byte15 };
        return __new;
    ]-*/;
    public static native CFUUIDBytes copyWithbyte0(CFUUIDBytes original, byte byte0) /*-[
        CFUUIDBytes __new = { .byte0 = byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte1(CFUUIDBytes original, byte byte1) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte2(CFUUIDBytes original, byte byte2) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte3(CFUUIDBytes original, byte byte3) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte4(CFUUIDBytes original, byte byte4) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte5(CFUUIDBytes original, byte byte5) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte6(CFUUIDBytes original, byte byte6) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte7(CFUUIDBytes original, byte byte7) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte8(CFUUIDBytes original, byte byte8) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte9(CFUUIDBytes original, byte byte9) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte10(CFUUIDBytes original, byte byte10) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte11(CFUUIDBytes original, byte byte11) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte12(CFUUIDBytes original, byte byte12) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte13(CFUUIDBytes original, byte byte13) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = byte13, .byte14 = original.byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte14(CFUUIDBytes original, byte byte14) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = byte14, .byte15 = original.byte15 };
        return __new;
    ]-*/;

    
    public static native CFUUIDBytes copyWithbyte15(CFUUIDBytes original, byte byte15) /*-[
        CFUUIDBytes __new = { .byte0 = original.byte0, .byte1 = original.byte1, .byte2 = original.byte2, .byte3 = original.byte3, .byte4 = original.byte4, .byte5 = original.byte5, .byte6 = original.byte6, .byte7 = original.byte7, .byte8 = original.byte8, .byte9 = original.byte9, .byte10 = original.byte10, .byte11 = original.byte11, .byte12 = original.byte12, .byte13 = original.byte13, .byte14 = original.byte14, .byte15 = byte15 };
        return __new;
    ]-*/;

    
}
