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






@Mapping("CFStringEncodings")
public final class CFStringEncodings extends ObjCEnum {
    
    @GlobalConstant("kCFStringEncodingMacJapanese")
    public static final long MacJapanese = 1L;
    @GlobalConstant("kCFStringEncodingMacChineseTrad")
    public static final long MacChineseTrad = 2L;
    @GlobalConstant("kCFStringEncodingMacKorean")
    public static final long MacKorean = 3L;
    @GlobalConstant("kCFStringEncodingMacArabic")
    public static final long MacArabic = 4L;
    @GlobalConstant("kCFStringEncodingMacHebrew")
    public static final long MacHebrew = 5L;
    @GlobalConstant("kCFStringEncodingMacGreek")
    public static final long MacGreek = 6L;
    @GlobalConstant("kCFStringEncodingMacCyrillic")
    public static final long MacCyrillic = 7L;
    @GlobalConstant("kCFStringEncodingMacDevanagari")
    public static final long MacDevanagari = 9L;
    @GlobalConstant("kCFStringEncodingMacGurmukhi")
    public static final long MacGurmukhi = 10L;
    @GlobalConstant("kCFStringEncodingMacGujarati")
    public static final long MacGujarati = 11L;
    @GlobalConstant("kCFStringEncodingMacOriya")
    public static final long MacOriya = 12L;
    @GlobalConstant("kCFStringEncodingMacBengali")
    public static final long MacBengali = 13L;
    @GlobalConstant("kCFStringEncodingMacTamil")
    public static final long MacTamil = 14L;
    @GlobalConstant("kCFStringEncodingMacTelugu")
    public static final long MacTelugu = 15L;
    @GlobalConstant("kCFStringEncodingMacKannada")
    public static final long MacKannada = 16L;
    @GlobalConstant("kCFStringEncodingMacMalayalam")
    public static final long MacMalayalam = 17L;
    @GlobalConstant("kCFStringEncodingMacSinhalese")
    public static final long MacSinhalese = 18L;
    @GlobalConstant("kCFStringEncodingMacBurmese")
    public static final long MacBurmese = 19L;
    @GlobalConstant("kCFStringEncodingMacKhmer")
    public static final long MacKhmer = 20L;
    @GlobalConstant("kCFStringEncodingMacThai")
    public static final long MacThai = 21L;
    @GlobalConstant("kCFStringEncodingMacLaotian")
    public static final long MacLaotian = 22L;
    @GlobalConstant("kCFStringEncodingMacGeorgian")
    public static final long MacGeorgian = 23L;
    @GlobalConstant("kCFStringEncodingMacArmenian")
    public static final long MacArmenian = 24L;
    @GlobalConstant("kCFStringEncodingMacChineseSimp")
    public static final long MacChineseSimp = 25L;
    @GlobalConstant("kCFStringEncodingMacTibetan")
    public static final long MacTibetan = 26L;
    @GlobalConstant("kCFStringEncodingMacMongolian")
    public static final long MacMongolian = 27L;
    @GlobalConstant("kCFStringEncodingMacEthiopic")
    public static final long MacEthiopic = 28L;
    @GlobalConstant("kCFStringEncodingMacCentralEurRoman")
    public static final long MacCentralEurRoman = 29L;
    @GlobalConstant("kCFStringEncodingMacVietnamese")
    public static final long MacVietnamese = 30L;
    @GlobalConstant("kCFStringEncodingMacExtArabic")
    public static final long MacExtArabic = 31L;
    @GlobalConstant("kCFStringEncodingMacSymbol")
    public static final long MacSymbol = 33L;
    @GlobalConstant("kCFStringEncodingMacDingbats")
    public static final long MacDingbats = 34L;
    @GlobalConstant("kCFStringEncodingMacTurkish")
    public static final long MacTurkish = 35L;
    @GlobalConstant("kCFStringEncodingMacCroatian")
    public static final long MacCroatian = 36L;
    @GlobalConstant("kCFStringEncodingMacIcelandic")
    public static final long MacIcelandic = 37L;
    @GlobalConstant("kCFStringEncodingMacRomanian")
    public static final long MacRomanian = 38L;
    @GlobalConstant("kCFStringEncodingMacCeltic")
    public static final long MacCeltic = 39L;
    @GlobalConstant("kCFStringEncodingMacGaelic")
    public static final long MacGaelic = 40L;
    @GlobalConstant("kCFStringEncodingMacFarsi")
    public static final long MacFarsi = 140L;
    @GlobalConstant("kCFStringEncodingMacUkrainian")
    public static final long MacUkrainian = 152L;
    @GlobalConstant("kCFStringEncodingMacInuit")
    public static final long MacInuit = 236L;
    @GlobalConstant("kCFStringEncodingMacVT100")
    public static final long MacVT100 = 252L;
    @GlobalConstant("kCFStringEncodingMacHFS")
    public static final long MacHFS = 255L;
    @GlobalConstant("kCFStringEncodingISOLatin2")
    public static final long ISOLatin2 = 514L;
    @GlobalConstant("kCFStringEncodingISOLatin3")
    public static final long ISOLatin3 = 515L;
    @GlobalConstant("kCFStringEncodingISOLatin4")
    public static final long ISOLatin4 = 516L;
    @GlobalConstant("kCFStringEncodingISOLatinCyrillic")
    public static final long ISOLatinCyrillic = 517L;
    @GlobalConstant("kCFStringEncodingISOLatinArabic")
    public static final long ISOLatinArabic = 518L;
    @GlobalConstant("kCFStringEncodingISOLatinGreek")
    public static final long ISOLatinGreek = 519L;
    @GlobalConstant("kCFStringEncodingISOLatinHebrew")
    public static final long ISOLatinHebrew = 520L;
    @GlobalConstant("kCFStringEncodingISOLatin5")
    public static final long ISOLatin5 = 521L;
    @GlobalConstant("kCFStringEncodingISOLatin6")
    public static final long ISOLatin6 = 522L;
    @GlobalConstant("kCFStringEncodingISOLatinThai")
    public static final long ISOLatinThai = 523L;
    @GlobalConstant("kCFStringEncodingISOLatin7")
    public static final long ISOLatin7 = 525L;
    @GlobalConstant("kCFStringEncodingISOLatin8")
    public static final long ISOLatin8 = 526L;
    @GlobalConstant("kCFStringEncodingISOLatin9")
    public static final long ISOLatin9 = 527L;
    @GlobalConstant("kCFStringEncodingISOLatin10")
    public static final long ISOLatin10 = 528L;
    @GlobalConstant("kCFStringEncodingDOSLatinUS")
    public static final long DOSLatinUS = 1024L;
    @GlobalConstant("kCFStringEncodingDOSGreek")
    public static final long DOSGreek = 1029L;
    @GlobalConstant("kCFStringEncodingDOSBalticRim")
    public static final long DOSBalticRim = 1030L;
    @GlobalConstant("kCFStringEncodingDOSLatin1")
    public static final long DOSLatin1 = 1040L;
    @GlobalConstant("kCFStringEncodingDOSGreek1")
    public static final long DOSGreek1 = 1041L;
    @GlobalConstant("kCFStringEncodingDOSLatin2")
    public static final long DOSLatin2 = 1042L;
    @GlobalConstant("kCFStringEncodingDOSCyrillic")
    public static final long DOSCyrillic = 1043L;
    @GlobalConstant("kCFStringEncodingDOSTurkish")
    public static final long DOSTurkish = 1044L;
    @GlobalConstant("kCFStringEncodingDOSPortuguese")
    public static final long DOSPortuguese = 1045L;
    @GlobalConstant("kCFStringEncodingDOSIcelandic")
    public static final long DOSIcelandic = 1046L;
    @GlobalConstant("kCFStringEncodingDOSHebrew")
    public static final long DOSHebrew = 1047L;
    @GlobalConstant("kCFStringEncodingDOSCanadianFrench")
    public static final long DOSCanadianFrench = 1048L;
    @GlobalConstant("kCFStringEncodingDOSArabic")
    public static final long DOSArabic = 1049L;
    @GlobalConstant("kCFStringEncodingDOSNordic")
    public static final long DOSNordic = 1050L;
    @GlobalConstant("kCFStringEncodingDOSRussian")
    public static final long DOSRussian = 1051L;
    @GlobalConstant("kCFStringEncodingDOSGreek2")
    public static final long DOSGreek2 = 1052L;
    @GlobalConstant("kCFStringEncodingDOSThai")
    public static final long DOSThai = 1053L;
    @GlobalConstant("kCFStringEncodingDOSJapanese")
    public static final long DOSJapanese = 1056L;
    @GlobalConstant("kCFStringEncodingDOSChineseSimplif")
    public static final long DOSChineseSimplif = 1057L;
    @GlobalConstant("kCFStringEncodingDOSKorean")
    public static final long DOSKorean = 1058L;
    @GlobalConstant("kCFStringEncodingDOSChineseTrad")
    public static final long DOSChineseTrad = 1059L;
    @GlobalConstant("kCFStringEncodingWindowsLatin2")
    public static final long WindowsLatin2 = 1281L;
    @GlobalConstant("kCFStringEncodingWindowsCyrillic")
    public static final long WindowsCyrillic = 1282L;
    @GlobalConstant("kCFStringEncodingWindowsGreek")
    public static final long WindowsGreek = 1283L;
    @GlobalConstant("kCFStringEncodingWindowsLatin5")
    public static final long WindowsLatin5 = 1284L;
    @GlobalConstant("kCFStringEncodingWindowsHebrew")
    public static final long WindowsHebrew = 1285L;
    @GlobalConstant("kCFStringEncodingWindowsArabic")
    public static final long WindowsArabic = 1286L;
    @GlobalConstant("kCFStringEncodingWindowsBalticRim")
    public static final long WindowsBalticRim = 1287L;
    @GlobalConstant("kCFStringEncodingWindowsVietnamese")
    public static final long WindowsVietnamese = 1288L;
    @GlobalConstant("kCFStringEncodingWindowsKoreanJohab")
    public static final long WindowsKoreanJohab = 1296L;
    @GlobalConstant("kCFStringEncodingANSEL")
    public static final long ANSEL = 1537L;
    @GlobalConstant("kCFStringEncodingJIS_X0201_76")
    public static final long JIS_X0201_76 = 1568L;
    @GlobalConstant("kCFStringEncodingJIS_X0208_83")
    public static final long JIS_X0208_83 = 1569L;
    @GlobalConstant("kCFStringEncodingJIS_X0208_90")
    public static final long JIS_X0208_90 = 1570L;
    @GlobalConstant("kCFStringEncodingJIS_X0212_90")
    public static final long JIS_X0212_90 = 1571L;
    @GlobalConstant("kCFStringEncodingJIS_C6226_78")
    public static final long JIS_C6226_78 = 1572L;
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalConstant("kCFStringEncodingShiftJIS_X0213")
    public static final long ShiftJIS_X0213 = 1576L;
    @GlobalConstant("kCFStringEncodingShiftJIS_X0213_MenKuTen")
    public static final long ShiftJIS_X0213_MenKuTen = 1577L;
    @GlobalConstant("kCFStringEncodingGB_2312_80")
    public static final long GB_2312_80 = 1584L;
    @GlobalConstant("kCFStringEncodingGBK_95")
    public static final long GBK_95 = 1585L;
    @GlobalConstant("kCFStringEncodingGB_18030_2000")
    public static final long GB_18030_2000 = 1586L;
    @GlobalConstant("kCFStringEncodingKSC_5601_87")
    public static final long KSC_5601_87 = 1600L;
    @GlobalConstant("kCFStringEncodingKSC_5601_92_Johab")
    public static final long KSC_5601_92_Johab = 1601L;
    @GlobalConstant("kCFStringEncodingCNS_11643_92_P1")
    public static final long CNS_11643_92_P1 = 1617L;
    @GlobalConstant("kCFStringEncodingCNS_11643_92_P2")
    public static final long CNS_11643_92_P2 = 1618L;
    @GlobalConstant("kCFStringEncodingCNS_11643_92_P3")
    public static final long CNS_11643_92_P3 = 1619L;
    @GlobalConstant("kCFStringEncodingISO_2022_JP")
    public static final long ISO_2022_JP = 2080L;
    @GlobalConstant("kCFStringEncodingISO_2022_JP_2")
    public static final long ISO_2022_JP_2 = 2081L;
    @GlobalConstant("kCFStringEncodingISO_2022_JP_1")
    public static final long ISO_2022_JP_1 = 2082L;
    @GlobalConstant("kCFStringEncodingISO_2022_JP_3")
    public static final long ISO_2022_JP_3 = 2083L;
    @GlobalConstant("kCFStringEncodingISO_2022_CN")
    public static final long ISO_2022_CN = 2096L;
    @GlobalConstant("kCFStringEncodingISO_2022_CN_EXT")
    public static final long ISO_2022_CN_EXT = 2097L;
    @GlobalConstant("kCFStringEncodingISO_2022_KR")
    public static final long ISO_2022_KR = 2112L;
    @GlobalConstant("kCFStringEncodingEUC_JP")
    public static final long EUC_JP = 2336L;
    @GlobalConstant("kCFStringEncodingEUC_CN")
    public static final long EUC_CN = 2352L;
    @GlobalConstant("kCFStringEncodingEUC_TW")
    public static final long EUC_TW = 2353L;
    @GlobalConstant("kCFStringEncodingEUC_KR")
    public static final long EUC_KR = 2368L;
    @GlobalConstant("kCFStringEncodingShiftJIS")
    public static final long ShiftJIS = 2561L;
    @GlobalConstant("kCFStringEncodingKOI8_R")
    public static final long KOI8_R = 2562L;
    @GlobalConstant("kCFStringEncodingBig5")
    public static final long Big5 = 2563L;
    @GlobalConstant("kCFStringEncodingMacRomanLatin1")
    public static final long MacRomanLatin1 = 2564L;
    @GlobalConstant("kCFStringEncodingHZ_GB_2312")
    public static final long HZ_GB_2312 = 2565L;
    @GlobalConstant("kCFStringEncodingBig5_HKSCS_1999")
    public static final long Big5_HKSCS_1999 = 2566L;
    @GlobalConstant("kCFStringEncodingVISCII")
    public static final long VISCII = 2567L;
    @GlobalConstant("kCFStringEncodingKOI8_U")
    public static final long KOI8_U = 2568L;
    @GlobalConstant("kCFStringEncodingBig5_E")
    public static final long Big5_E = 2569L;
    @GlobalConstant("kCFStringEncodingNextStepJapanese")
    public static final long NextStepJapanese = 2818L;
    @GlobalConstant("kCFStringEncodingEBCDIC_US")
    public static final long EBCDIC_US = 3073L;
    @GlobalConstant("kCFStringEncodingEBCDIC_CP037")
    public static final long EBCDIC_CP037 = 3074L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFStringEncodingUTF7")
    public static final long UTF7 = 67109120L;
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalConstant("kCFStringEncodingUTF7_IMAP")
    public static final long UTF7_IMAP = 2576L;
    @GlobalConstant("kCFStringEncodingShiftJIS_X0213_00")
    public static final long ShiftJIS_X0213_00 = 1576L;
    

}
