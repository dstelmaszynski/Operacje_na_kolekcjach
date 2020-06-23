package lombok;

import org.graalvm.compiler.nodeinfo.NodeInfo;

@Data
@AllArgsConstructor
public class Pair {
    private int a;
    private int b;
}
