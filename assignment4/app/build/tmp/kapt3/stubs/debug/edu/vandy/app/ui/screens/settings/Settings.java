package edu.vandy.app.ui.screens.settings;

/**
 * All settings that are saved/restored from shared
 * preferences and changeable from the SettingsDialogFragment.
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\bE\n\u0002\u0010\u0007\n\u0003\b\u00a7\u0001\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010\u009c\u0002\u001a\u00030\u009d\u00022\u0007\u0010\u009e\u0002\u001a\u00020\u000fR\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001f\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000fX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001f\u0010,\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u0014\u0010.\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001f\u00102\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR\u001f\u00104\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\bR\u001f\u00106\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\bR\u0014\u00108\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00101R\u0014\u0010:\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u0014\u0010<\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0014\u0010>\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00101R\u0014\u0010@\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00101R\u0014\u0010B\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0014\u0010D\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0014\u0010F\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00101R\u0014\u0010H\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00101R\u0014\u0010J\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00101R\u0014\u0010L\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00101R\u0014\u0010N\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u0014\u0010P\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0014\u0010R\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0014\u0010T\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00101R\u0014\u0010V\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00101R\u0014\u0010X\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00101R\u0014\u0010Z\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00101R\u0014\u0010\\\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u00101R\u0014\u0010^\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u00101R\u0014\u0010`\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u00101R\u0014\u0010b\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u00101R\u0014\u0010d\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\be\u00101R\u0014\u0010f\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u00101R\u0014\u0010h\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u00101R\u0014\u0010j\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u00101R\u0014\u0010l\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u00101R\u0014\u0010n\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u00101R\u0014\u0010p\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u00101R\u0014\u0010r\u001a\u00020/X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\bs\u00101R\u001f\u0010t\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010u0u0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010\bR\u001f\u0010w\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010\bR\u001f\u0010y\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010\bR5\u0010|\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001c\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u0012\u0004\b}\u0010\u0002\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R9\u0010\u0084\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u008a\u0001\u0010\u0083\u0001\u0012\u0005\b\u0085\u0001\u0010\u0002\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R8\u0010\u008b\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u008f\u0001\u0010\u0083\u0001\u0012\u0005\b\u008c\u0001\u0010\u0002\u001a\u0005\b\u008d\u0001\u0010\u007f\"\u0006\b\u008e\u0001\u0010\u0081\u0001RD\u0010\u0090\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u0095\u0001\u0010\u0083\u0001\u0012\u0005\b\u0091\u0001\u0010\u0002\u001a\u0005\b\u0092\u0001\u0010\b\"\u0006\b\u0093\u0001\u0010\u0094\u0001R9\u0010\u0096\u0001\u001a\u00020\u00122\u0006\u0010{\u001a\u00020\u00128F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u009c\u0001\u0010\u0083\u0001\u0012\u0005\b\u0097\u0001\u0010\u0002\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R8\u0010\u009d\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00a1\u0001\u0010\u0083\u0001\u0012\u0005\b\u009e\u0001\u0010\u0002\u001a\u0005\b\u009f\u0001\u0010\u007f\"\u0006\b\u00a0\u0001\u0010\u0081\u0001RD\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00a6\u0001\u0010\u0083\u0001\u0012\u0005\b\u00a3\u0001\u0010\u0002\u001a\u0005\b\u00a4\u0001\u0010\b\"\u0006\b\u00a5\u0001\u0010\u0094\u0001RD\u0010\u00a7\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00ab\u0001\u0010\u0083\u0001\u0012\u0005\b\u00a8\u0001\u0010\u0002\u001a\u0005\b\u00a9\u0001\u0010\b\"\u0006\b\u00aa\u0001\u0010\u0094\u0001R8\u0010\u00ac\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00b0\u0001\u0010\u0083\u0001\u0012\u0005\b\u00ad\u0001\u0010\u0002\u001a\u0005\b\u00ae\u0001\u0010\u007f\"\u0006\b\u00af\u0001\u0010\u0081\u0001R9\u0010\u00b1\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00b5\u0001\u0010\u0083\u0001\u0012\u0005\b\u00b2\u0001\u0010\u0002\u001a\u0006\b\u00b3\u0001\u0010\u0087\u0001\"\u0006\b\u00b4\u0001\u0010\u0089\u0001R9\u0010\u00b6\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00ba\u0001\u0010\u0083\u0001\u0012\u0005\b\u00b7\u0001\u0010\u0002\u001a\u0006\b\u00b8\u0001\u0010\u0087\u0001\"\u0006\b\u00b9\u0001\u0010\u0089\u0001R8\u0010\u00bb\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00bf\u0001\u0010\u0083\u0001\u0012\u0005\b\u00bc\u0001\u0010\u0002\u001a\u0005\b\u00bd\u0001\u0010\u007f\"\u0006\b\u00be\u0001\u0010\u0081\u0001RD\u0010\u00c0\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00c4\u0001\u0010\u0083\u0001\u0012\u0005\b\u00c1\u0001\u0010\u0002\u001a\u0005\b\u00c2\u0001\u0010\b\"\u0006\b\u00c3\u0001\u0010\u0094\u0001R9\u0010\u00c5\u0001\u001a\u00020\u001e2\u0006\u0010{\u001a\u00020\u001e8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00cb\u0001\u0010\u0083\u0001\u0012\u0005\b\u00c6\u0001\u0010\u0002\u001a\u0006\b\u00c7\u0001\u0010\u00c8\u0001\"\u0006\b\u00c9\u0001\u0010\u00ca\u0001R8\u0010\u00cc\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00d0\u0001\u0010\u0083\u0001\u0012\u0005\b\u00cd\u0001\u0010\u0002\u001a\u0005\b\u00ce\u0001\u0010\u007f\"\u0006\b\u00cf\u0001\u0010\u0081\u0001RD\u0010\u00d1\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00d5\u0001\u0010\u0083\u0001\u0012\u0005\b\u00d2\u0001\u0010\u0002\u001a\u0005\b\u00d3\u0001\u0010\b\"\u0006\b\u00d4\u0001\u0010\u0094\u0001R9\u0010\u00d6\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00da\u0001\u0010\u0083\u0001\u0012\u0005\b\u00d7\u0001\u0010\u0002\u001a\u0006\b\u00d8\u0001\u0010\u0087\u0001\"\u0006\b\u00d9\u0001\u0010\u0089\u0001R9\u0010\u00db\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00df\u0001\u0010\u0083\u0001\u0012\u0005\b\u00dc\u0001\u0010\u0002\u001a\u0006\b\u00dd\u0001\u0010\u0087\u0001\"\u0006\b\u00de\u0001\u0010\u0089\u0001R9\u0010\u00e0\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00e4\u0001\u0010\u0083\u0001\u0012\u0005\b\u00e1\u0001\u0010\u0002\u001a\u0006\b\u00e2\u0001\u0010\u0087\u0001\"\u0006\b\u00e3\u0001\u0010\u0089\u0001R9\u0010\u00e5\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00e9\u0001\u0010\u0083\u0001\u0012\u0005\b\u00e6\u0001\u0010\u0002\u001a\u0006\b\u00e7\u0001\u0010\u0087\u0001\"\u0006\b\u00e8\u0001\u0010\u0089\u0001R9\u0010\u00ea\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00ee\u0001\u0010\u0083\u0001\u0012\u0005\b\u00eb\u0001\u0010\u0002\u001a\u0006\b\u00ec\u0001\u0010\u0087\u0001\"\u0006\b\u00ed\u0001\u0010\u0089\u0001R9\u0010\u00ef\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00f3\u0001\u0010\u0083\u0001\u0012\u0005\b\u00f0\u0001\u0010\u0002\u001a\u0006\b\u00f1\u0001\u0010\u0087\u0001\"\u0006\b\u00f2\u0001\u0010\u0089\u0001R9\u0010\u00f4\u0001\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u00f8\u0001\u0010\u0083\u0001\u0012\u0005\b\u00f5\u0001\u0010\u0002\u001a\u0006\b\u00f6\u0001\u0010\u0087\u0001\"\u0006\b\u00f7\u0001\u0010\u0089\u0001R8\u0010\u00f9\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u00fd\u0001\u0010\u0083\u0001\u0012\u0005\b\u00fa\u0001\u0010\u0002\u001a\u0005\b\u00fb\u0001\u0010\u007f\"\u0006\b\u00fc\u0001\u0010\u0081\u0001R8\u0010\u00fe\u0001\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u0082\u0002\u0010\u0083\u0001\u0012\u0005\b\u00ff\u0001\u0010\u0002\u001a\u0005\b\u0080\u0002\u0010\u007f\"\u0006\b\u0081\u0002\u0010\u0081\u0001RD\u0010\u0083\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u0087\u0002\u0010\u0083\u0001\u0012\u0005\b\u0084\u0002\u0010\u0002\u001a\u0005\b\u0085\u0002\u0010\b\"\u0006\b\u0086\u0002\u0010\u0094\u0001R9\u0010\u0088\u0002\u001a\u00020\u000f2\u0006\u0010{\u001a\u00020\u000f8F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\n\u0006\b\u008c\u0002\u0010\u0083\u0001\u0012\u0005\b\u0089\u0002\u0010\u0002\u001a\u0006\b\u008a\u0002\u0010\u0087\u0001\"\u0006\b\u008b\u0002\u0010\u0089\u0001R8\u0010\u008d\u0002\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u0091\u0002\u0010\u0083\u0001\u0012\u0005\b\u008e\u0002\u0010\u0002\u001a\u0005\b\u008f\u0002\u0010\u007f\"\u0006\b\u0090\u0002\u0010\u0081\u0001RD\u0010\u0092\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u0096\u0002\u0010\u0083\u0001\u0012\u0005\b\u0093\u0002\u0010\u0002\u001a\u0005\b\u0094\u0002\u0010\b\"\u0006\b\u0095\u0002\u0010\u0094\u0001R8\u0010\u0097\u0002\u001a\u00020\u00052\u0006\u0010{\u001a\u00020\u00058F@FX\u0087\u008e\u0002\u00a2\u0006\u001e\n\u0006\b\u009b\u0002\u0010\u0083\u0001\u0012\u0005\b\u0098\u0002\u0010\u0002\u001a\u0005\b\u0099\u0002\u0010\u007f\"\u0006\b\u009a\u0002\u0010\u0081\u0001\u00a8\u0006\u009f\u0002"}, d2 = {"Ledu/vandy/app/ui/screens/settings/Settings;", "", "()V", "ANIMATION_RANGE", "Ledu/vandy/app/utils/Range;", "", "kotlin.jvm.PlatformType", "getANIMATION_RANGE", "()Ledu/vandy/app/utils/Range;", "BEING_COUNT_RANGE", "getBEING_COUNT_RANGE", "BEING_SIZE_RANGE", "getBEING_SIZE_RANGE", "DEFAULT_ANIMATION_SPEED", "DEFAULT_AUTO_SCALE", "", "DEFAULT_BEING_COUNT", "DEFAULT_BEING_MANAGER_TYPE", "Ledu/vandy/simulator/managers/beings/BeingManager$Factory$Type;", "DEFAULT_BEING_SIZE", "DEFAULT_GAZING_DURATION", "DEFAULT_GAZING_ITERATIONS", "DEFAULT_IMAGE_DOWNLOADER", "Ledu/vandy/app/extensions/ImageDownloader$Type;", "getDEFAULT_IMAGE_DOWNLOADER", "()Ledu/vandy/app/extensions/ImageDownloader$Type;", "DEFAULT_LOGGING", "DEFAULT_MODEL_CHECKER", "DEFAULT_PALANTIRI_COUNT", "DEFAULT_PALANTIRI_MANAGER_TYPE", "Ledu/vandy/simulator/managers/palantiri/PalantiriManager$Factory$Type;", "DEFAULT_PALANTIRI_SIZE", "DEFAULT_PERFORMANCE_MODE", "DEFAULT_SAVE_ON_EXIT", "DEFAULT_SHOW_PATHS", "DEFAULT_SHOW_PROGRESS", "DEFAULT_SHOW_SPRITES", "DEFAULT_SHOW_STATES", "DEFAULT_SHOW_WIRE_FRAMES", "DEFAULT_SPRITE", "DEFAULT_STATE_SIZE", "DEFAULT_STRICT_MODE", "DEFAULT_THREAD_COUNT", "DEFAULT_VIEW_TRANSPARENCY", "GAZING_DURATION_RANGE", "getGAZING_DURATION_RANGE", "IMAGE_DOWNLOADER_PREF", "", "getIMAGE_DOWNLOADER_PREF", "()Ljava/lang/String;", "ITERATIONS_RANGE", "getITERATIONS_RANGE", "PALANTIR_COUNT_RANGE", "getPALANTIR_COUNT_RANGE", "PALANTIR_SIZE_RANGE", "getPALANTIR_SIZE_RANGE", "SIMULATION_ANIMATION_SPEED_PREF", "getSIMULATION_ANIMATION_SPEED_PREF", "SIMULATION_AUTO_SCALE_PREF", "getSIMULATION_AUTO_SCALE_PREF", "SIMULATION_BEING_COUNT_PREF", "getSIMULATION_BEING_COUNT_PREF", "SIMULATION_BEING_COUNT_RANGE_PREF", "getSIMULATION_BEING_COUNT_RANGE_PREF", "SIMULATION_BEING_MANAGER_TYPE_PREF", "getSIMULATION_BEING_MANAGER_TYPE_PREF", "SIMULATION_BEING_SIZE_PREF", "getSIMULATION_BEING_SIZE_PREF", "SIMULATION_BEING_SIZE_RANGE_PREF", "getSIMULATION_BEING_SIZE_RANGE_PREF", "SIMULATION_GAZING_DURATION_PREF", "getSIMULATION_GAZING_DURATION_PREF", "SIMULATION_GAZING_ITERATIONS_COUNT_PREF", "getSIMULATION_GAZING_ITERATIONS_COUNT_PREF", "SIMULATION_LOGGING_PREF", "getSIMULATION_LOGGING_PREF", "SIMULATION_MODEL_CHECKER_PREF", "getSIMULATION_MODEL_CHECKER_PREF", "SIMULATION_PALANTIRI_MANAGER_TYPE_PREF", "getSIMULATION_PALANTIRI_MANAGER_TYPE_PREF", "SIMULATION_PALANTIRI_SIZE_PREF", "getSIMULATION_PALANTIRI_SIZE_PREF", "SIMULATION_PALANTIR_COUNT_PREF", "getSIMULATION_PALANTIR_COUNT_PREF", "SIMULATION_PALANTIR_COUNT_RANGE_PREF", "getSIMULATION_PALANTIR_COUNT_RANGE_PREF", "SIMULATION_PALANTIR_SIZE_RANGE_PREF", "getSIMULATION_PALANTIR_SIZE_RANGE_PREF", "SIMULATION_PERFORMANCE_MODE_PREF", "getSIMULATION_PERFORMANCE_MODE_PREF", "SIMULATION_SAVE_ON_EXIT_PREF", "getSIMULATION_SAVE_ON_EXIT_PREF", "SIMULATION_SHOW_PATHS_PREF", "getSIMULATION_SHOW_PATHS_PREF", "SIMULATION_SHOW_PROGRESS_PREF", "getSIMULATION_SHOW_PROGRESS_PREF", "SIMULATION_SHOW_SPRITES_PREF", "getSIMULATION_SHOW_SPRITES_PREF", "SIMULATION_SHOW_STATES_PREF", "getSIMULATION_SHOW_STATES_PREF", "SIMULATION_SHOW_WIRE_FRAMES_PREF", "getSIMULATION_SHOW_WIRE_FRAMES_PREF", "SIMULATION_SPRITE_PREF", "getSIMULATION_SPRITE_PREF", "SIMULATION_STATE_SIZE_PREF", "getSIMULATION_STATE_SIZE_PREF", "SIMULATION_STATE_SIZE_RANGE_PREF", "getSIMULATION_STATE_SIZE_RANGE_PREF", "SIMULATION_STRICT_MODE_PREF", "getSIMULATION_STRICT_MODE_PREF", "SIMULATION_THREAD_COUNT_PREF", "getSIMULATION_THREAD_COUNT_PREF", "SIMULATION_THREAD_COUNT_RANGE_PREF", "getSIMULATION_THREAD_COUNT_RANGE_PREF", "SIMULATION_VIEW_TRANSPARENCY_PREF", "getSIMULATION_VIEW_TRANSPARENCY_PREF", "STATE_SIZE_RANGE", "", "getSTATE_SIZE_RANGE", "THREAD_COUNT_RANGE", "getTHREAD_COUNT_RANGE", "VIEW_TRANSPARENCY_RANGE", "getVIEW_TRANSPARENCY_RANGE", "<set-?>", "animationSpeed", "getAnimationSpeed$annotations", "getAnimationSpeed", "()I", "setAnimationSpeed", "(I)V", "animationSpeed$delegate", "Ledu/vandy/app/preferences/Preference;", "autoScale", "getAutoScale$annotations", "getAutoScale", "()Z", "setAutoScale", "(Z)V", "autoScale$delegate", "beingCount", "getBeingCount$annotations", "getBeingCount", "setBeingCount", "beingCount$delegate", "beingCountRange", "getBeingCountRange$annotations", "getBeingCountRange", "setBeingCountRange", "(Ledu/vandy/app/utils/Range;)V", "beingCountRange$delegate", "beingManagerType", "getBeingManagerType$annotations", "getBeingManagerType", "()Ledu/vandy/simulator/managers/beings/BeingManager$Factory$Type;", "setBeingManagerType", "(Ledu/vandy/simulator/managers/beings/BeingManager$Factory$Type;)V", "beingManagerType$delegate", "beingSize", "getBeingSize$annotations", "getBeingSize", "setBeingSize", "beingSize$delegate", "beingSizeRange", "getBeingSizeRange$annotations", "getBeingSizeRange", "setBeingSizeRange", "beingSizeRange$delegate", "gazingDuration", "getGazingDuration$annotations", "getGazingDuration", "setGazingDuration", "gazingDuration$delegate", "gazingIterations", "getGazingIterations$annotations", "getGazingIterations", "setGazingIterations", "gazingIterations$delegate", "logging", "getLogging$annotations", "getLogging", "setLogging", "logging$delegate", "modelChecker", "getModelChecker$annotations", "getModelChecker", "setModelChecker", "modelChecker$delegate", "palantirCount", "getPalantirCount$annotations", "getPalantirCount", "setPalantirCount", "palantirCount$delegate", "palantirCountRange", "getPalantirCountRange$annotations", "getPalantirCountRange", "setPalantirCountRange", "palantirCountRange$delegate", "palantirManagerType", "getPalantirManagerType$annotations", "getPalantirManagerType", "()Ledu/vandy/simulator/managers/palantiri/PalantiriManager$Factory$Type;", "setPalantirManagerType", "(Ledu/vandy/simulator/managers/palantiri/PalantiriManager$Factory$Type;)V", "palantirManagerType$delegate", "palantirSize", "getPalantirSize$annotations", "getPalantirSize", "setPalantirSize", "palantirSize$delegate", "palantirSizeRange", "getPalantirSizeRange$annotations", "getPalantirSizeRange", "setPalantirSizeRange", "palantirSizeRange$delegate", "performanceMode", "getPerformanceMode$annotations", "getPerformanceMode", "setPerformanceMode", "performanceMode$delegate", "saveOnExit", "getSaveOnExit$annotations", "getSaveOnExit", "setSaveOnExit", "saveOnExit$delegate", "showPaths", "getShowPaths$annotations", "getShowPaths", "setShowPaths", "showPaths$delegate", "showProgress", "getShowProgress$annotations", "getShowProgress", "setShowProgress", "showProgress$delegate", "showSprites", "getShowSprites$annotations", "getShowSprites", "setShowSprites", "showSprites$delegate", "showStates", "getShowStates$annotations", "getShowStates", "setShowStates", "showStates$delegate", "showWireFrames", "getShowWireFrames$annotations", "getShowWireFrames", "setShowWireFrames", "showWireFrames$delegate", "sprite", "getSprite$annotations", "getSprite", "setSprite", "sprite$delegate", "stateSize", "getStateSize$annotations", "getStateSize", "setStateSize", "stateSize$delegate", "stateSizeRange", "getStateSizeRange$annotations", "getStateSizeRange", "setStateSizeRange", "stateSizeRange$delegate", "strictMode", "getStrictMode$annotations", "getStrictMode", "setStrictMode", "strictMode$delegate", "threadCount", "getThreadCount$annotations", "getThreadCount", "setThreadCount", "threadCount$delegate", "threadCountRange", "getThreadCountRange$annotations", "getThreadCountRange", "setThreadCountRange", "threadCountRange$delegate", "viewTransparency", "getViewTransparency$annotations", "getViewTransparency", "setViewTransparency", "viewTransparency$delegate", "resetToDefaults", "", "simulationRunning", "app_debug"})
public final class Settings {
    
    /**
     * Preference keys defined for other classes to connect to.
     */
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_ANIMATION_SPEED_PREF = "SimulationSpeedPreference";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_BEING_COUNT_PREF = "SimulationBeingCount";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PALANTIR_COUNT_PREF = "SimulationPalantirCount";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_GAZING_ITERATIONS_COUNT_PREF = "SimulationGazingIterations";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SHOW_SPRITES_PREF = "SimulationShowSprites";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SHOW_PATHS_PREF = "SimulationShowPaths";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SHOW_STATES_PREF = "SimulationShowStates";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SPRITE_PREF = "SimulationSprite";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_LOGGING_PREF = "SimulationLogging";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SHOW_WIRE_FRAMES_PREF = "SimulationShowWireFrames";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_GAZING_DURATION_PREF = "SimulationGazingDuration";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_AUTO_SCALE_PREF = "SimulationAutoScale";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_VIEW_TRANSPARENCY_PREF = "SimulationViewTransparency";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_BEING_MANAGER_TYPE_PREF = "SimulationBeingManagerType";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PALANTIRI_MANAGER_TYPE_PREF = "SimulationPalantiriManagerType";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_BEING_SIZE_PREF = "SimulationBeingSize";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_BEING_SIZE_RANGE_PREF = "SimulationBeingSizeRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_BEING_COUNT_RANGE_PREF = "SimulationBeingCountRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PALANTIRI_SIZE_PREF = "SimulationPalantiriSize";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PALANTIR_SIZE_RANGE_PREF = "SimulationPalantirSizeRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PALANTIR_COUNT_RANGE_PREF = "SimulationPalantirCountRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_STATE_SIZE_RANGE_PREF = "SimulationStateSizeRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_STATE_SIZE_PREF = "SimulationStateSize";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SAVE_ON_EXIT_PREF = "SimulationSaveOnExit";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_PERFORMANCE_MODE_PREF = "SimulationPerformanceMode";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_STRICT_MODE_PREF = "SimulationStrictMode";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_MODEL_CHECKER_PREF = "SimulationModelChecker";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_SHOW_PROGRESS_PREF = "SimulationShowProgress";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_THREAD_COUNT_PREF = "SimulationThreadCountPref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String SIMULATION_THREAD_COUNT_RANGE_PREF = "SimulationThreadCountRangePref";
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String IMAGE_DOWNLOADER_PREF = "imageDownloaderPref";
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.extensions.ImageDownloader.Type DEFAULT_IMAGE_DOWNLOADER = edu.vandy.app.extensions.ImageDownloader.Type.PICASSO;
    
    /**
     * Default preference values.
     */
    private static final int DEFAULT_BEING_COUNT = 5;
    private static final int DEFAULT_PALANTIRI_COUNT = 3;
    private static final int DEFAULT_GAZING_ITERATIONS = 5;
    private static final int DEFAULT_ANIMATION_SPEED = 50;
    private static final boolean DEFAULT_SHOW_SPRITES = true;
    private static final boolean DEFAULT_SHOW_STATES = true;
    private static final boolean DEFAULT_SHOW_PATHS = true;
    private static final int DEFAULT_SPRITE = 0;
    private static final boolean DEFAULT_LOGGING = true;
    private static final boolean DEFAULT_SHOW_WIRE_FRAMES = false;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> DEFAULT_GAZING_DURATION = null;
    private static final boolean DEFAULT_AUTO_SCALE = true;
    private static final int DEFAULT_VIEW_TRANSPARENCY = 15;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.simulator.managers.beings.BeingManager.Factory.Type DEFAULT_BEING_MANAGER_TYPE = edu.vandy.simulator.managers.beings.BeingManager.Factory.Type.RUNNABLE_THREADS;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type DEFAULT_PALANTIRI_MANAGER_TYPE = edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type.ARRAY_BLOCKING_QUEUE;
    private static final boolean DEFAULT_SAVE_ON_EXIT = true;
    private static final boolean DEFAULT_PERFORMANCE_MODE = false;
    private static final boolean DEFAULT_STRICT_MODE = false;
    private static final boolean DEFAULT_MODEL_CHECKER = false;
    private static final boolean DEFAULT_SHOW_PROGRESS = true;
    private static final int DEFAULT_THREAD_COUNT = 0;
    
    /**
     * To avoid accumulating rounding errors by converting
     * between dp and px values, all sizes are saved in px
     * values.
     */
    private static final int DEFAULT_BEING_SIZE = 0;
    private static final int DEFAULT_PALANTIRI_SIZE = 0;
    private static final int DEFAULT_STATE_SIZE = 0;
    
    /**
     * Default preference range values.
     *
     * Note that in the case of SeekBars, specifying a
     * max of 10 will create a seek range of 0 to 9, but
     * values will be incremented by 1 before being sent
     * to the UI.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> ITERATIONS_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> GAZING_DURATION_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> VIEW_TRANSPARENCY_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> ANIMATION_RANGE = null;
    
    /**
     * These default values are just reasonable guesses
     * and may not make sense for smaller displays, so
     * the actual min and max range values are adjusted
     * by SimulationView when it performs it initial
     * layout.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> BEING_COUNT_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> PALANTIR_COUNT_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> THREAD_COUNT_RANGE = null;
    
    /**
     * To avoid accumulating rounding errors by converting
     * between dp and px values, all sizes are saved in px
     * values. The maximum values are really irrelevant here
     * because they will always be set dynamically based on
     * sprite counts, resolution, and display size.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> BEING_SIZE_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Integer> PALANTIR_SIZE_RANGE = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.utils.Range<java.lang.Float> STATE_SIZE_RANGE = null;
    
    /**
     * Tunable range values set by SimulationView to account
     * for different display sizes and resolutions.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference beingSizeRange$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference beingCountRange$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference threadCountRange$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference palantirSizeRange$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference palantirCountRange$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference stateSizeRange$delegate = null;
    
    /**
     * These preferences have fixed names so that other classes
     * can use the preference key name to observe changes on that key.
     */
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference beingCount$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference palantirCount$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference gazingIterations$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference animationSpeed$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference showSprites$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference showPaths$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference showStates$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference sprite$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference logging$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference showWireFrames$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference gazingDuration$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference autoScale$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference viewTransparency$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference beingManagerType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference palantirManagerType$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference beingSize$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference palantirSize$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference stateSize$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference saveOnExit$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference performanceMode$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference strictMode$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference modelChecker$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference showProgress$delegate = null;
    @org.jetbrains.annotations.NotNull
    private static final edu.vandy.app.preferences.Preference threadCount$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.ui.screens.settings.Settings INSTANCE = null;
    
    private Settings() {
        super();
    }
    
    /**
     * Preference keys defined for other classes to connect to.
     */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_ANIMATION_SPEED_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_BEING_COUNT_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PALANTIR_COUNT_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_GAZING_ITERATIONS_COUNT_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SHOW_SPRITES_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SHOW_PATHS_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SHOW_STATES_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SPRITE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_LOGGING_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SHOW_WIRE_FRAMES_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_GAZING_DURATION_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_AUTO_SCALE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_VIEW_TRANSPARENCY_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_BEING_MANAGER_TYPE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PALANTIRI_MANAGER_TYPE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_BEING_SIZE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_BEING_SIZE_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_BEING_COUNT_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PALANTIRI_SIZE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PALANTIR_SIZE_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PALANTIR_COUNT_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_STATE_SIZE_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_STATE_SIZE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SAVE_ON_EXIT_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_PERFORMANCE_MODE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_STRICT_MODE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_MODEL_CHECKER_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_SHOW_PROGRESS_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_THREAD_COUNT_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSIMULATION_THREAD_COUNT_RANGE_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIMAGE_DOWNLOADER_PREF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.extensions.ImageDownloader.Type getDEFAULT_IMAGE_DOWNLOADER() {
        return null;
    }
    
    /**
     * Default preference range values.
     *
     * Note that in the case of SeekBars, specifying a
     * max of 10 will create a seek range of 0 to 9, but
     * values will be incremented by 1 before being sent
     * to the UI.
     */
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getITERATIONS_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getGAZING_DURATION_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getVIEW_TRANSPARENCY_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getANIMATION_RANGE() {
        return null;
    }
    
    /**
     * These default values are just reasonable guesses
     * and may not make sense for smaller displays, so
     * the actual min and max range values are adjusted
     * by SimulationView when it performs it initial
     * layout.
     */
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getBEING_COUNT_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getPALANTIR_COUNT_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getTHREAD_COUNT_RANGE() {
        return null;
    }
    
    /**
     * To avoid accumulating rounding errors by converting
     * between dp and px values, all sizes are saved in px
     * values. The maximum values are really irrelevant here
     * because they will always be set dynamically based on
     * sprite counts, resolution, and display size.
     */
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getBEING_SIZE_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Integer> getPALANTIR_SIZE_RANGE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final edu.vandy.app.utils.Range<java.lang.Float> getSTATE_SIZE_RANGE() {
        return null;
    }
    
    /**
     * Tunable range values set by SimulationView to account
     * for different display sizes and resolutions.
     */
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getBeingSizeRange() {
        return null;
    }
    
    /**
     * Tunable range values set by SimulationView to account
     * for different display sizes and resolutions.
     */
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getBeingSizeRange$annotations() {
    }
    
    /**
     * Tunable range values set by SimulationView to account
     * for different display sizes and resolutions.
     */
    public static final void setBeingSizeRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getBeingCountRange() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getBeingCountRange$annotations() {
    }
    
    public static final void setBeingCountRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getThreadCountRange() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getThreadCountRange$annotations() {
    }
    
    public static final void setThreadCountRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getPalantirSizeRange() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPalantirSizeRange$annotations() {
    }
    
    public static final void setPalantirSizeRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getPalantirCountRange() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPalantirCountRange$annotations() {
    }
    
    public static final void setPalantirCountRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getStateSizeRange() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getStateSizeRange$annotations() {
    }
    
    public static final void setStateSizeRange(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    /**
     * These preferences have fixed names so that other classes
     * can use the preference key name to observe changes on that key.
     */
    public static final int getBeingCount() {
        return 0;
    }
    
    /**
     * These preferences have fixed names so that other classes
     * can use the preference key name to observe changes on that key.
     */
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getBeingCount$annotations() {
    }
    
    /**
     * These preferences have fixed names so that other classes
     * can use the preference key name to observe changes on that key.
     */
    public static final void setBeingCount(int p0) {
    }
    
    public static final int getPalantirCount() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPalantirCount$annotations() {
    }
    
    public static final void setPalantirCount(int p0) {
    }
    
    public static final int getGazingIterations() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getGazingIterations$annotations() {
    }
    
    public static final void setGazingIterations(int p0) {
    }
    
    public static final int getAnimationSpeed() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getAnimationSpeed$annotations() {
    }
    
    public static final void setAnimationSpeed(int p0) {
    }
    
    public static final boolean getShowSprites() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getShowSprites$annotations() {
    }
    
    public static final void setShowSprites(boolean p0) {
    }
    
    public static final boolean getShowPaths() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getShowPaths$annotations() {
    }
    
    public static final void setShowPaths(boolean p0) {
    }
    
    public static final boolean getShowStates() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getShowStates$annotations() {
    }
    
    public static final void setShowStates(boolean p0) {
    }
    
    public static final int getSprite() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getSprite$annotations() {
    }
    
    public static final void setSprite(int p0) {
    }
    
    public static final boolean getLogging() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getLogging$annotations() {
    }
    
    public static final void setLogging(boolean p0) {
    }
    
    public static final boolean getShowWireFrames() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getShowWireFrames$annotations() {
    }
    
    public static final void setShowWireFrames(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.app.utils.Range<java.lang.Integer> getGazingDuration() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getGazingDuration$annotations() {
    }
    
    public static final void setGazingDuration(@org.jetbrains.annotations.NotNull
    edu.vandy.app.utils.Range<java.lang.Integer> p0) {
    }
    
    public static final boolean getAutoScale() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getAutoScale$annotations() {
    }
    
    public static final void setAutoScale(boolean p0) {
    }
    
    public static final int getViewTransparency() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getViewTransparency$annotations() {
    }
    
    public static final void setViewTransparency(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.simulator.managers.beings.BeingManager.Factory.Type getBeingManagerType() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getBeingManagerType$annotations() {
    }
    
    public static final void setBeingManagerType(@org.jetbrains.annotations.NotNull
    edu.vandy.simulator.managers.beings.BeingManager.Factory.Type p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type getPalantirManagerType() {
        return null;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPalantirManagerType$annotations() {
    }
    
    public static final void setPalantirManagerType(@org.jetbrains.annotations.NotNull
    edu.vandy.simulator.managers.palantiri.PalantiriManager.Factory.Type p0) {
    }
    
    public static final int getBeingSize() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getBeingSize$annotations() {
    }
    
    public static final void setBeingSize(int p0) {
    }
    
    public static final int getPalantirSize() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPalantirSize$annotations() {
    }
    
    public static final void setPalantirSize(int p0) {
    }
    
    public static final int getStateSize() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getStateSize$annotations() {
    }
    
    public static final void setStateSize(int p0) {
    }
    
    public static final boolean getSaveOnExit() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getSaveOnExit$annotations() {
    }
    
    public static final void setSaveOnExit(boolean p0) {
    }
    
    public static final boolean getPerformanceMode() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getPerformanceMode$annotations() {
    }
    
    public static final void setPerformanceMode(boolean p0) {
    }
    
    public static final boolean getStrictMode() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getStrictMode$annotations() {
    }
    
    public static final void setStrictMode(boolean p0) {
    }
    
    public static final boolean getModelChecker() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getModelChecker$annotations() {
    }
    
    public static final void setModelChecker(boolean p0) {
    }
    
    public static final boolean getShowProgress() {
        return false;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getShowProgress$annotations() {
    }
    
    public static final void setShowProgress(boolean p0) {
    }
    
    public static final int getThreadCount() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic
    @java.lang.Deprecated
    public static void getThreadCount$annotations() {
    }
    
    public static final void setThreadCount(int p0) {
    }
    
    public final void resetToDefaults(boolean simulationRunning) {
    }
}