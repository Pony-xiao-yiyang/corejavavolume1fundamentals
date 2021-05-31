/**
 * @description:Java设计环境-First demo
 * @author:Adolf Musk
 * @time: 2021/5/14 23:16
 */
public class Demo01 {
    public static void main(String[] args) {
        /**
         * 下载 JDK 之后， 需要安装这个开发包并明确要在哪里安装， 后面还会需要这个信息。
         *      •在 Windows 上， 启动安装程序。 会询问你要在哪里安装 JDK。
         *          最好不要接受路径名 中包含空格的默认位置，如c:\ProgramFiles\Java\jdkl.8.0_verj/o«。取出路径名中的
         *          Program Files 部分就可以了。
         *      •在 Mac 上， 运行安装程序。 这会把软件安装到 /Libraiy/Java/JavaV lMachines/jdk1.8.0_ version.jdk/Contents/Home。
         *          用 Finder 找到这个目录。
         *      •在 Linux 上只需要把 .tar.gz 文件解压缩到你选择的某个位置，
         *          如你的主目录， 或者 /op。如果从 RPM 文件安装， 则要反复检查是否安装在 /usr/java/jdk1.8.0_ version.jdk
         *          在这本书中， 安装目录用)成表示。
         *          例如， 谈到如M)in 目录时， 是指 /opt/jdkl.8.0_31/bin 或 c:\Java\jdkl _8_0_31\bin 目录。
         *          在 Windows 或 Linux 上安装 JDK 时， 还需要另外完成一个步骤: 将如;t/bin 目录增加到
         *          执行路径中一执行路径是操作系统查找可执行文件时所遍历的目录列表。
         *      •在 Linux 上， 需要在 7.bashrc 或 7.bash_profile 文件的最后增加这样一行:export PATH=/jdk/bin:$PATH
         *          一定要使用 JDK 的正确路径， 如 /opt/jdkl .8.0_31。
         *      •在 Windows 上， 启动控制面板， 选择“ 系统与安全’(System and Security，) 再选择‘ 系
         *          统”(System)，选择高级系统设置(Advanced System Settings)(参见图 2-1 。)
         *          在系统属 性(SystemProperties) 对话框中， 点击“ 高级”(Advanced) 标签页，
         *          \然后点击“ 环境” (Environment) 按钮。滚动“ 系统变量”(System Variables) 列表,
         *          直到找到名为 Path 的变量。点击“ 编辑”(Edit) 按钮。
         *          将 jdk/bin 目录增加到路径最前面， 并用一个分号分隔新增的这一项， 注意要把 _/成替换为具体的 Java 安装路径，
         *          如 c:\Java\jdkL8.0_31。 如果忽视前面的建议，
         *          想要保留 Program Files 部分，
         *          则要把整个路径用双引号引起来: "c:\ProgramFiles\Java\ jdkl.8.0_31\bin"; 其他目录。
         *          保存所做的设置。 之后新打开的所有控制台窗口都会有正确的路径。 可以如下测试设置是否正确:
         *          打开一个终端窗口， 键入:javac -version
         *          然后按回车键。 应该能看到显示以下信息: javac 1.8.0J1
         *          如果得到诸如“ javac: command not found ” ( javac: : 命令未找到 )
         *          或 “ The name specified is not recognized as an internal or external command, operable program or batch file”
         *          (指定名不 是一个内部或外部命令、 可执行的程序或批文件，)
         *          就需要退回去反复检査你的安装。
         *
         */
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.println("=");
            System.out.println();
        }
    }
}
