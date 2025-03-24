const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmamytc/",
            name: "ssmamytc",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmamytc/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "外来人口管理系统小程序"
        } 
    }
}
export default base
