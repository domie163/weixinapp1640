<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="身份证号" prop="shenfenzhenghao">
          <el-input v-model="ruleForm.shenfenzhenghao" readonly              placeholder="身份证号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="姓名" prop="xingming">
          <el-input v-model="ruleForm.xingming"               placeholder="姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="出生日期" prop="chushengriqi">
          <el-input v-model="ruleForm.chushengriqi"               placeholder="出生日期" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='wailairenkou'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in wailairenkouxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="民族" prop="minzu">
          <el-input v-model="ruleForm.minzu"               placeholder="民族" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="职业" prop="zhiye">
          <el-input v-model="ruleForm.zhiye"               placeholder="职业" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='wailairenkou'"  label="婚姻状况" prop="hunyinzhuangkuang">
          <el-select v-model="ruleForm.hunyinzhuangkuang" placeholder="请选择婚姻状况">
            <el-option
                v-for="(item,index) in wailairenkouhunyinzhuangkuangOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="文化程度" prop="wenhuachengdu">
          <el-input v-model="ruleForm.wenhuachengdu"               placeholder="文化程度" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="血型" prop="xuexing">
          <el-input v-model="ruleForm.xuexing"               placeholder="血型" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="手机" prop="shouji">
          <el-input v-model="ruleForm.shouji"               placeholder="手机" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="健康状况" prop="jiankangzhuangkuang">
          <el-input v-model="ruleForm.jiankangzhuangkuang"               placeholder="健康状况" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="暂住地址" prop="zanzhudizhi">
          <el-input v-model="ruleForm.zanzhudizhi"               placeholder="暂住地址" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='wailairenkou'"  label="户籍所在地" prop="hujisuozaidi">
          <el-input v-model="ruleForm.hujisuozaidi"               placeholder="户籍所在地" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                    <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="账号" prop="zhanghao">
          <el-input v-model="ruleForm.zhanghao" readonly              placeholder="账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="派出所名称" prop="paichusuomingcheng">
          <el-input v-model="ruleForm.paichusuomingcheng"               placeholder="派出所名称" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="负责人" prop="fuzeren">
          <el-input v-model="ruleForm.fuzeren"               placeholder="负责人" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="电话" prop="dianhua">
          <el-input v-model="ruleForm.dianhua"               placeholder="电话" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="邮箱" prop="youxiang">
          <el-input v-model="ruleForm.youxiang"               placeholder="邮箱" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="地址" prop="dizhi">
          <el-input v-model="ruleForm.dizhi"               placeholder="地址" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="网址" prop="wangzhi">
          <el-input v-model="ruleForm.wangzhi"               placeholder="网址" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='paichusuo'"  label="服务时间" prop="fuwushijian">
          <el-input v-model="ruleForm.fuwushijian"               placeholder="服务时间" clearable></el-input>
        </el-form-item>
      </el-col>
                                                      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                              wailairenkouxingbieOptions: [],
                                                wailairenkouhunyinzhuangkuangOptions: [],
                                                                                                                                                                                                                                                                                        };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                                    this.wailairenkouxingbieOptions = "男,女".split(',')
                                this.wailairenkouhunyinzhuangkuangOptions = "已婚,未婚".split(',')
                                                                                                                                                                                          },
  methods: {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            onUpdateHandler() {
                              if((!this.ruleForm.shenfenzhenghao)&& 'wailairenkou'==this.flag){
        this.$message.error('身份证号不能为空');
        return
      }
                                                if( 'wailairenkou' ==this.flag && this.ruleForm.shenfenzhenghao&&(!checkIdCard(this.ruleForm.shenfenzhenghao))){
        this.$message.error(`身份证号应输入身份证格式`);
        return
      }
                              if((!this.ruleForm.mima)&& 'wailairenkou'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                  if((!this.ruleForm.xingming)&& 'wailairenkou'==this.flag){
        this.$message.error('姓名不能为空');
        return
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    if( 'wailairenkou' ==this.flag && this.ruleForm.shouji&&(!isMobile(this.ruleForm.shouji))){
        this.$message.error(`手机应输入手机格式`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                if((!this.ruleForm.zhanghao)&& 'paichusuo'==this.flag){
        this.$message.error('账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'paichusuo'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                        if((!this.ruleForm.fuzeren)&& 'paichusuo'==this.flag){
        this.$message.error('负责人不能为空');
        return
      }
                                                                                                                                                      if( 'paichusuo' ==this.flag && this.ruleForm.youxiang&&(!isEmail(this.ruleForm.youxiang))){
        this.$message.error(`邮箱应输入邮箱格式`);
        return
      }
                                                                                                                                                                                                                                    this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
