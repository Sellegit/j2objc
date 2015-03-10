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






@Mapping("CTFontTableTag")
public final class CTFontTableTag extends ObjCEnum {
    
    @GlobalConstant("kCTFontTableBASE")
    public static final long BASE = 1111577413L;
    @GlobalConstant("kCTFontTableCFF")
    public static final long CFF = 1128678944L;
    @GlobalConstant("kCTFontTableDSIG")
    public static final long DSIG = 1146308935L;
    @GlobalConstant("kCTFontTableEBDT")
    public static final long EBDT = 1161970772L;
    @GlobalConstant("kCTFontTableEBLC")
    public static final long EBLC = 1161972803L;
    @GlobalConstant("kCTFontTableEBSC")
    public static final long EBSC = 1161974595L;
    @GlobalConstant("kCTFontTableGDEF")
    public static final long GDEF = 1195656518L;
    @GlobalConstant("kCTFontTableGPOS")
    public static final long GPOS = 1196445523L;
    @GlobalConstant("kCTFontTableGSUB")
    public static final long GSUB = 1196643650L;
    @GlobalConstant("kCTFontTableJSTF")
    public static final long JSTF = 1246975046L;
    @GlobalConstant("kCTFontTableLTSH")
    public static final long LTSH = 1280594760L;
    @GlobalConstant("kCTFontTableMATH")
    public static final long MATH = 1296127048L;
    @GlobalConstant("kCTFontTableOS2")
    public static final long OS2 = 1330851634L;
    @GlobalConstant("kCTFontTablePCLT")
    public static final long PCLT = 1346587732L;
    @GlobalConstant("kCTFontTableVDMX")
    public static final long VDMX = 1447316824L;
    @GlobalConstant("kCTFontTableVORG")
    public static final long VORG = 1448038983L;
    @GlobalConstant("kCTFontTableZapf")
    public static final long Zapf = 1516335206L;
    @GlobalConstant("kCTFontTableAcnt")
    public static final long Acnt = 1633906292L;
    @GlobalConstant("kCTFontTableAnkr")
    public static final long Ankr = 1634626418L;
    @GlobalConstant("kCTFontTableAvar")
    public static final long Avar = 1635148146L;
    @GlobalConstant("kCTFontTableBdat")
    public static final long Bdat = 1650745716L;
    @GlobalConstant("kCTFontTableBhed")
    public static final long Bhed = 1651008868L;
    @GlobalConstant("kCTFontTableBloc")
    public static final long Bloc = 1651273571L;
    @GlobalConstant("kCTFontTableBsln")
    public static final long Bsln = 1651731566L;
    @GlobalConstant("kCTFontTableCmap")
    public static final long Cmap = 1668112752L;
    @GlobalConstant("kCTFontTableCvar")
    public static final long Cvar = 1668702578L;
    @GlobalConstant("kCTFontTableCvt")
    public static final long Cvt = 1668707360L;
    @GlobalConstant("kCTFontTableFdsc")
    public static final long Fdsc = 1717859171L;
    @GlobalConstant("kCTFontTableFeat")
    public static final long Feat = 1717920116L;
    @GlobalConstant("kCTFontTableFmtx")
    public static final long Fmtx = 1718449272L;
    @GlobalConstant("kCTFontTableFpgm")
    public static final long Fpgm = 1718642541L;
    @GlobalConstant("kCTFontTableFvar")
    public static final long Fvar = 1719034226L;
    @GlobalConstant("kCTFontTableGasp")
    public static final long Gasp = 1734439792L;
    @GlobalConstant("kCTFontTableGlyf")
    public static final long Glyf = 1735162214L;
    @GlobalConstant("kCTFontTableGvar")
    public static final long Gvar = 1735811442L;
    @GlobalConstant("kCTFontTableHdmx")
    public static final long Hdmx = 1751412088L;
    @GlobalConstant("kCTFontTableHead")
    public static final long Head = 1751474532L;
    @GlobalConstant("kCTFontTableHhea")
    public static final long Hhea = 1751672161L;
    @GlobalConstant("kCTFontTableHmtx")
    public static final long Hmtx = 1752003704L;
    @GlobalConstant("kCTFontTableHsty")
    public static final long Hsty = 1752396921L;
    @GlobalConstant("kCTFontTableJust")
    public static final long Just = 1786082164L;
    @GlobalConstant("kCTFontTableKern")
    public static final long Kern = 1801810542L;
    @GlobalConstant("kCTFontTableKerx")
    public static final long Kerx = 1801810552L;
    @GlobalConstant("kCTFontTableLcar")
    public static final long Lcar = 1818452338L;
    @GlobalConstant("kCTFontTableLtag")
    public static final long Ltag = 1819566439L;
    @GlobalConstant("kCTFontTableLoca")
    public static final long Loca = 1819239265L;
    @GlobalConstant("kCTFontTableMaxp")
    public static final long Maxp = 1835104368L;
    @GlobalConstant("kCTFontTableMort")
    public static final long Mort = 1836020340L;
    @GlobalConstant("kCTFontTableMorx")
    public static final long Morx = 1836020344L;
    @GlobalConstant("kCTFontTableName")
    public static final long Name = 1851878757L;
    @GlobalConstant("kCTFontTableOpbd")
    public static final long Opbd = 1869636196L;
    @GlobalConstant("kCTFontTablePost")
    public static final long Post = 1886352244L;
    @GlobalConstant("kCTFontTablePrep")
    public static final long Prep = 1886545264L;
    @GlobalConstant("kCTFontTableProp")
    public static final long Prop = 1886547824L;
    @GlobalConstant("kCTFontTableSbit")
    public static final long Sbit = 1935829364L;
    @GlobalConstant("kCTFontTableSbix")
    public static final long Sbix = 1935829368L;
    @GlobalConstant("kCTFontTableTrak")
    public static final long Trak = 1953653099L;
    @GlobalConstant("kCTFontTableVhea")
    public static final long Vhea = 1986553185L;
    @GlobalConstant("kCTFontTableVmtx")
    public static final long Vmtx = 1986884728L;
    

}
