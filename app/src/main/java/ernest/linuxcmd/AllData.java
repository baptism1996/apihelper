package ernest.linuxcmd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by sicilian on 2018/10/25.
 */

public class AllData {
    public List<String> sortList=new ArrayList<>();
    public List<String> apiList1=new ArrayList<>();
    public List<String> apiList2=new ArrayList<>();
    public List<String> apiList3=new ArrayList<>();
    public List<String> apiList4=new ArrayList<>();
    public List<String> apiList5=new ArrayList<>();
    public List<String> apiList6=new ArrayList<>();



    public List<String> getSortList() {
        sortList.clear();
        sortList.add("文件I/O");
        sortList.add("文件和目录");
        sortList.add("标准I/O库");
        sortList.add("系统数据文件和信息");
        sortList.add("进程");
        sortList.add("信号");
        return sortList;
    }
    public List<String> getApiList1(){
        apiList1.clear();
        apiList1.add("fdopen");
        apiList1.add("fgets");
        apiList1.add("fileno");
        apiList1.add("fmemopen");
        apiList1.add("feof");
        apiList1.add("ferror");
        apiList1.add("fflush");
        apiList1.add("fgetc");
        apiList1.add("fgetops");
        apiList1.add("lseek");
        apiList1.add("Ioctl");
        apiList1.add("dup");
        apiList1.add("dup2");
        apiList1.add("close");
        apiList1.add("msync");
        apiList1.add("munmap");
        apiList1.add("open");
        apiList1.add("getchar");
        apiList1.add("fsync");
        apiList1.add("fcntl");
        return apiList1;
    }
    public List<String> getApiList2(){
        apiList2.clear();
        String [] apiStr2={"mkdtemp","mkififo","mkstemp","Mktime","mkdirat","mkdir","lstat","lchown","telldir","truncate","renameat","access","getcwd","symlink","readdir","Recv","readlink","readlinkat","setpwent","ferror","fflush","fgetc","fgetops","chdir","chmod","closedir","faccessat",
        "fchdir","fchmod","fchmodat","fchown","fchownat","chdir","chmod","pread","msync","munmap","pathconf","opendir","openlog","pathconf","ptsname","fputc","fputs","fread","ftruncate","futimens","fseeko","fsetpos","fstatat","fwide","fwrite","fpathconf","umask","ungetc"};
        Collections.addAll(apiList2,apiStr2);
        return apiList2;
    }
    public List<String> getApiList3(){
        apiList3.clear();
        String[] apiStr3={"link","linkat","setvbuf","snprintf","tmpfile","tmpnam","rmdir","seekdir","scanf","putchar","setbuf","fdopen",
                "fgets","fileno","fmemopen","feof","ferror","fflush","fgetc","fgetpos","dprintf","clearerr","printf","msync","munmap",
                "open_memstream","open_wmemstream","pause","popen","pclose","pipe","msgrcv","msgsnd","nice","nanosleep","putc","putchar",
                "freopen","fscanf","fseek","fopen","fprintf","ftell","ftello","fclose","mmap","mprotect","msgctl","msgget","localtime",
                "initgroups","getspent","getspnam","gettimeofday","gets","setspent","getpwnam","getpwent","sysconf","syslog","System",
                "getgroups","gethostname","getlogin","getgrent","getgrgid","getgrnam","setlogmask","clock_settime","clock_getres",
        "clock_gettime","endspent","umask"};
        Collections.addAll(apiList3,apiStr3);
        return apiList3;
    }
    public List<String> getApiList4(){
        apiList4.clear();
        String[] apiStr4={"malloc","longjmp","getpwuid","atexit","calloc","free","setuid","setuid","shutdown","sig2str","sigaction",
        "sigaddset","shmat","shmctl","shmdt","shmget","times","getpid","getppid","getpriority","getegid",
        "geteuid","getgid","getenv","setgid","seteuid","setegid","setjmp","setreuid","setregid","setpriority",
        "setenv","setrlimit","fexecve","msync","munmap","pause","nanosleep","popen","pclose","pipe",
        "msgrcv","msgsnd","fork","execl","execle","execlp","execv","execvp","Exit","lio_listio","getuid"};
        Collections.addAll(apiList4,apiStr4);
        return apiList4;
    }
    public List<String>getApiList5(){
        apiList5.clear();
        String[] apiStr5={"*gmtime","getrlimit","csetpgrp","getpgid","getpgrp","sem_close","semctl","sem_destroy","semget","sem_getvalue",
        "sem_init","semop","sem_open","sem_wait","setlogmask","setsid","CMSG_DATA","CMSG_FIRSTHDR","CMSG_LEN","pause","chown",
        "nanosleep","popen","pclose","pipe","msgrcv","msgsnd","ftok","funlockfile"};
        Collections.addAll(apiList5,apiStr5);
        return apiList5;
    }
    public List<String> getApiList6(){
        apiList6.clear();
        String[] apiStr6={"*getsid","siglongjmp","signal","sigpending","sigprocmask","sleep","sigdelset","sigemptyset","sigfillset","sigismember","sigqueue","Sigsetjmp",
                "Sigsuspend","Sigwait","abort","alarm","strsignal","pwrite","etpgid","clock_nanosleep","nanosleep",
                "dup","dup2","close","create"};
        Collections.addAll(apiList6,apiStr6);
        return apiList6;
    }
}
